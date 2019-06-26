package com.wincarn.pdf.controller;

import org.springframework.stereotype.Controller;

import java.io.File;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: Dking
 * @Email: dking@188.com
 * @Description:
 * @Date: 2019-06-26 14:46
 * @Version: 1.0
 */

@Controller
public class getFileController {

    public static void main(String[] args) {

        String path="/tmp/office";
        //调用方法
        getFiles(path);

    }



    public static void getFiles(String path) {
        File file = new File(path);
        // 如果这个路径是文件夹
        if (file.isDirectory()) {
            // 获取路径下的所有文件
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                // 如果还是文件夹 递归获取里面的文件 文件夹
                if (files[i].isDirectory()) {
                    System.out.println("目录：" + files[i].getPath());
                    getFiles(files[i].getPath());
                } else {
                    System.out.println("文件：" + files[i].getPath());
                }

            }
        } else {
            System.out.println("文件：" + file.getPath());
        }
    }


}
