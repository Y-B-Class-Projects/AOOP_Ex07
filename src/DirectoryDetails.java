import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DirectoryDetails extends FileDetails {
    List<FileDetails> files;

    public DirectoryDetails(String path, String name){
        super(path,name);
        files = new ArrayList<FileDetails>();
    }

    @Override
    public void accept(FileVisitor visitor) {
        for(FileDetails file: files){
            file.accept(visitor);
        }
        visitor.visit(this);
    }

    public void addFile(FileDetails fileDetails){
        files.add(fileDetails);
    }
}