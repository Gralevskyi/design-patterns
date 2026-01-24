package com.hralievsky.learning.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class File implements FileSystemEntry {
    private final String name;
    private final long size;
    private String path;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
        this.path = "/" + name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path.trim();
    }

    @Override
    public List<FileSystemEntry> search(String keyword) {
        if (name.equals(keyword)) {
            return List.of(this);
        }
        return new ArrayList<>();
    }
}
