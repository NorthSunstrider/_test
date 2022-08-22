package com.northsunstrider.wow;

import java.io.File;

/**
 * @Description: 对WOW截图进行重命名<br/>
 *               原命名方式为 WoWScrnShot_122017_182708.jpg 改为WoWScrnShot_171220_182708.jpg<br/>
 *               将mmddyy改为yymmdd
 * @author: North
 * @date: 2018年7月4日 下午4:53:55
 */
public class WoWScrnShotRenameTool {

    /**
     * @Description TODO
     * @param args
     */
    public static void main(String[] args) {
        rename();
    }

    public static void rename() {
        File file = new File("C:\\Game\\World of Warcraft\\_retail_\\Screenshots");
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            String path = file.getPath();

            for (File f : files) {
                String oldName = f.getName();
                System.out.println(oldName);
                String newName = new StringBuilder().append("WoWScrnShot_").append(oldName.substring(16, 18))
                    .append(oldName.substring(12, 16)).append(oldName.substring(18, 29)).toString();
                f.renameTo(new File(path + "\\" + newName));
            }

        }

    }
}
