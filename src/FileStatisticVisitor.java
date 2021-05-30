public class FileStatisticVisitor implements FileVisitor{

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
       System.out.println("The file " + docxFileDetails.name + " has an average of " + String.format("%.6f", (double)docxFileDetails.getWords()/docxFileDetails.getPages()) + " words per page.");
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        int sum = 0;

        FileCountVisitor countVisitor = new FileCountVisitor();
        directoryDetails.accept(countVisitor);

        System.out.println("Directory " + directoryDetails.name + " has " + countVisitor.getCount() + " files.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file " + htmlFileDetails.name + " contains " + htmlFileDetails.getLines() + " lines.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        System.out.println("The picture " + jpgFileDetails.name + " has an average of " + String.format("%.6f", (double)jpgFileDetails.getSize() / (jpgFileDetails.getHeight() * jpgFileDetails.getWidth())) + " bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        System.out.println("The bitrate of " + mp3FileDetails.name + " is " + String.format("%.6f", (double)mp3FileDetails.getSize() / mp3FileDetails.getLengthSec()) + " bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        System.out.println("The average slide size in Presentation " + pptxFileDetails.name + " is " +String.format("%.6f", (double)pptxFileDetails.getSize()/pptxFileDetails.getSlides()) + ".");
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file " + txtFileDetails.name + " contains " + txtFileDetails.getWords() + " words.");
    }
}
