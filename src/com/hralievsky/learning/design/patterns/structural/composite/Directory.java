package com.hralievsky.learning.design.patterns.structural.composite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Directory implements FileSystemEntry {
    private static final String SLASH = "/";
    private final String name;
    private String path;
    private final Set<FileSystemEntry> children = new HashSet<>();

    public Directory(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return children.stream().mapToLong(FileSystemEntry::getSize).sum();
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path.trim();
        children.forEach(child -> {
            String newPath = path.equals(SLASH)
                ? SLASH + child.getName()
                : path + SLASH + child.getName();
            child.setPath(newPath);
        });
    }

    @Override
    public List<FileSystemEntry> search(String keyword) {
        return children.stream()
                .map(child -> child.search(keyword))
                .flatMap(List::stream)
                .toList();
    }

    public void addChild(FileSystemEntry child) {
        String newPath = getPath().equals(SLASH)
            ? SLASH + child.getName()
            : getPath() + SLASH + child.getName();
        child.setPath(newPath);
        children.add(child);
    }

    public void removeChild(FileSystemEntry child) {
        child.setPath(null);
        children.remove(child);
    }
}
