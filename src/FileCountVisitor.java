public class FileCountVisitor implements FileVisitor{
    private int totalCount;

    public FileCountVisitor() {
        totalCount = 0;
    }

    public int getCount() {
        return totalCount;
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        totalCount++;
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        totalCount++;
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        totalCount++;
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        totalCount++;
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        totalCount++;
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        totalCount++;
    }
}
