package com.wholefoods.framework.managers;

import com.wholefoods.framework.dataProvider.ConfigFileReader;

import java.io.IOException;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class FileReaderManager {
    private static FileReaderManager fileReaderManager=new FileReaderManager();
    private static ConfigFileReader configFileReader;

    public FileReaderManager() {
    }

    public static FileReaderManager getFileReaderManager(){
        return fileReaderManager;
    }
    public ConfigFileReader getConfigFileReader() throws IOException {
        if(configFileReader==null){
            configFileReader=new ConfigFileReader();
        }
        return configFileReader;
    }
}
