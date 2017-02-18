package example4;

public enum FileType {
    XML("xml"),
    CSV("csv"),
    EXCEL("xlsx");

    FileType(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    private String fileExtension;

    public String getFileExtension() {
        return fileExtension;
    }

    public static FileType getFileType(String fileExtension) {
        for (FileType fileType : FileType.values()) {
            if (fileType.getFileExtension().equalsIgnoreCase(fileExtension)) {
                return fileType;
            }
        }

        return null;
    }
}
