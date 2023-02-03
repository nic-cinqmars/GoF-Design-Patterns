package builder.builder;

public class HTMLContract extends Contract
{
    @Override
    public void addDocument(String document)
    {
        documents.add("<HTML>" + document + "</HTML>");
    }

    @Override
    public void print()
    {
        System.out.println("- HTML Documents -");
        for (String document : documents) {
            System.out.println(document);
        }
    }
}
