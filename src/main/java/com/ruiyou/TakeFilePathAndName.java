package com.ruiyou;

import java.io.File;    

/**  
 * 
 * 该类可以输出指定路径下所有的文件名（文件名和文件夹名）
 * 指定一个路径即可
 *  
 */  
public class TakeFilePathAndName {   
	
	public static int count = 0;

    public static void main(String[] args) {   
        //这是需要获取的文件夹路径  
        String path = "D:\\MyEclipselike1\\PacMQ\\src";   
        int file = getFile(path);   
        System.out.println("共有 ：" +file );
    }   

    /*
     * 函数名：getFile
     * 作用：使用递归，输出指定文件夹内的所有文件
     * 参数：path：文件夹路径   deep：表示文件的层次深度，控制前置空格的个数
     * 前置空格缩进，显示文件层次结构
     */
    private static int getFile(String path){   
        // 获得指定文件对象  
        File file = new File(path);   
        // 获得该文件夹内的所有文件   
        File[] array = file.listFiles();   

        for(int i=0;i<array.length;i++)
        {   
            if(array[i].isFile())//是一个文件该方法返回true，否则该方法返回false
            { 
                int indexOf = array[i].getName().indexOf(".java");
                if (indexOf != -1) {
                	 System.out.println( array[i].getName());
                	++ count;
                }
            }else if (array[i].isDirectory()) {	//是一个目录该方法返回true，否则该方法返回false
            	getFile(array[i].getPath());
            }
        }
		return count;  
    }   
} 
