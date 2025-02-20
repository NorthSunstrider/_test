package com.northsunstrider.wow;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class BilibiliDownloadFileRenamer {

    public static void main(String[] args) {
        rename();
    }

    public static void rename() {
        File file = new File("D:\\视频\\知识");
        File newFilePath = new File("D:\\视频\\Bilibili tmp");
        if (!newFilePath.exists()) {
            try {
                newFilePath.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            String path = file.getPath();

            for (File f : files) {
                int count = 0;
                File newFile = null;
                String infoName = "";

                for (File x : f.listFiles()) {

                    if ("dvi".equals(getFileExtension(x))) {
                        FileReader fileReader = new FileReader(x);
                        String result = fileReader.readString();
                        JSONObject jsonObject = JSONUtil.parseObj(result);
                        infoName = jsonObject.getStr("Title");
                        infoName = sanitizeFileName(infoName, "_");

                        newFile = new File(newFilePath.getPath() + "\\" + infoName);
                        newFile.mkdir();
                        System.out.println(infoName);
                        System.out.println(x.getParent());
                    }


                }

                for (File x : f.listFiles()) {
                    if ("cover.jpg".equals(x.getName())) {
                        File cover = new File(newFile.getPath() + "\\" + "cover.jpg");
                        try {
                            cover.createNewFile();
                            Files.copy(x.toPath(), cover.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }


                    }


                    if (x.isDirectory()) {
                        for (File y : x.listFiles()) {
                            if ("mp4".equals(getFileExtension(y))) {
                                try {
                                    File mp4File = new File(newFile.getPath() + "\\" + infoName + "_" + y.getParentFile().getName() + ".mp4");
                                    mp4File.createNewFile();
                                    Files.copy(y.toPath(), mp4File.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }

                        }
                    }

                }


            }
        }

    }

    public static String getFileExtension(File file) {
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0) { // 确保点不在文件名开头
            return fileName.substring(lastDotIndex + 1).toLowerCase(); // 统一转为小写
        }
        return ""; // 无扩展名
    }

    public static String readSecondLineWithFilesLines(File file) {
        try (Stream<String> lines = Files.lines(file.toPath())) {
            return lines.skip(1).findFirst().orElse(null);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String sanitizeFileName(String originalName, String replacement) {
        if (originalName == null || originalName.isEmpty()) {
            return "unnamed";
        }

        // 正则表达式匹配非法字符：\ / : * ? " < > | 以及控制字符（ASCII 0-31）
        Pattern illegalCharsPattern = Pattern.compile("[\\\\/:*?\"<>|\u0000-\u001F]");
        String filtered = illegalCharsPattern.matcher(originalName).replaceAll(replacement);

        // 去除开头和结尾的点和空格
        filtered = filtered.replaceAll("^[. ]+", ""); // 开头的点或空格
        filtered = filtered.replaceAll("[. ]+$", ""); // 结尾的点或空格

        // 处理空结果
        if (filtered.isEmpty()) {
            return "unnamed";
        }

        return filtered;
    }

}