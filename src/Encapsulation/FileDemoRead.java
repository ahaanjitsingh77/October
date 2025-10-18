package Encapsulation;

public class FileDemoRead {
    private boolean isReadable;
    private boolean isWriteable;

//    public FileDemoRead ( String isReadable, String isWritable){
//        this.isReadable = isReadable;
//        this.iswriteable = isWritable;
//    }

    public FileDemoRead(boolean isReadable, boolean isWriteable) {
        this.isReadable = isReadable;
        this.isWriteable = isWriteable;

    }

    public boolean isReadable() {
        return isReadable;
    }

    public boolean isWriteable() {
        return isWriteable;
    }

    public void setReadable(boolean readable) {

    }
}