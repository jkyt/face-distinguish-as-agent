package com.jsc.utils;

import java.io.*;
import java.util.*;

public class PropertiesUtil {
	
	private static Properties properties = null;
	
	// 读取资源文件,并处理中文乱码
    public static void readPropertiesFileObj() {
        properties = new QdjProperties();
        try {
            InputStream inputStream = new FileInputStream("config.properties");
            BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            properties.load(bf);
            inputStream.close(); // 关闭流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 写资源文件，含中文
    /*public static void writePropertiesFileObj(String filename, Properties properties,String comments) {
        if (properties == null) {
            properties = new OrderedProperties();
        }
        try {
            OutputStream outputStream = new FileOutputStream(filename);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));
            properties.store(bw, comments);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    
    public static String getValue(String key) {
		if(properties == null) {
			readPropertiesFileObj();
		}
		return properties.getProperty(key);
	}
		
    
    public static void main(String[] args) {
    	System.out.println(PropertiesUtil.getValue("10011"));
    	System.out.println(PropertiesUtil.getValue("wxs.docking.fzjg"));
    	System.out.println(PropertiesUtil.getValue("chinese"));
    	//pro.remove("password0.008229652622303574");
        //pro.setProperty("chinese", "中文4");
        //writePropertiesFileObj(readfile, pro,"chinese:china"); // 写properties文件
    }
}


class QdjProperties extends Properties {
    private static final long serialVersionUID = -4627607243846121965L;
    private final LinkedHashSet<Object> keys = new LinkedHashSet<Object>();

    public Enumeration<Object> keys() {
        return Collections.<Object> enumeration(keys);
    }

    public Object put(Object key, Object value) {
        keys.add(key);
        return super.put(key, value);
    }

    public synchronized Object remove(Object key) {
        keys.remove(key);
        return super.remove(key);
    }

    public Set<Object> keySet() {
        return keys;
    }

    public Set<String> stringPropertyNames() {
        Set<String> set = new LinkedHashSet<String>();
        for (Object key : this.keys) {
            set.add((String) key);
        }
        return set;

    }
}