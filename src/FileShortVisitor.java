public class FileShortVisitor implements FileVisitor{

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
       System.out.println(docxFileDetails.name);
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        System.out.println(directoryDetails.name);
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println(htmlFileDetails.name);
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        System.out.println(jpgFileDetails.name);
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        System.out.println(mp3FileDetails.name);
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        System.out.println(pptxFileDetails.name);
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println(txtFileDetails.name);
    }
}
