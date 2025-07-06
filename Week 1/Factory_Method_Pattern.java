public class Factory_Method_Pattern {
        interface Document {
            void open();
        }
        static class WordDocument implements Document {
            @Override
            public void open() {
                System.out.println("Opening Word Document...");
            }
        }
    
        static class PdfDocument implements Document {
            @Override
            public void open() {
                System.out.println("Opening PDF Document...");
            }
        }
    
        static class ExcelDocument implements Document {
            @Override
            public void open() {
                System.out.println("Opening Excel Document...");
            }
        }
    
        static abstract class DocumentFactory {
            public abstract Document createDocument();
        }

        static class WordFactory extends DocumentFactory {
            @Override
            public Document createDocument() {
                return new WordDocument();
            }
        }
    
        static class PdfFactory extends DocumentFactory {
            @Override
            public Document createDocument() {
                return new PdfDocument();
            }
        }
    
        static class ExcelFactory extends DocumentFactory {
            @Override
            public Document createDocument() {
                return new ExcelDocument();
            }
        }

        public static void main(String[] args) {
        
            DocumentFactory wordFactory = new WordFactory();
            Document word = wordFactory.createDocument();
            word.open();
    
            DocumentFactory pdfFactory = new PdfFactory();
            Document pdf = pdfFactory.createDocument();
            pdf.open();
    
           
            DocumentFactory excelFactory = new ExcelFactory();
            Document excel = excelFactory.createDocument();
            excel.open();
        }
    }
    
