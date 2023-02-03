package builder.builder;

public class PDFContract extends Contract
{
    @Override
    public void addDocument(String document)
    {
        documents.add("<PDF>" + document + "</PDF>");
    }

    @Override
    public void print()
    {
        System.out.println("- PDF Documents -");
        for (String document : documents) {
            System.out.println(document);
        }
    }
}
