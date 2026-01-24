package com.hralievsky.learning.design.patterns.structural.composite;

import java.util.List;

public interface FileSystemEntry {

    String getName();

    long getSize();

    String getPath();

    void setPath(String path);

    List<FileSystemEntry> search(String keyword);

}
