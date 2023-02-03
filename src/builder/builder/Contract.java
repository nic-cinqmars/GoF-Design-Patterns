package builder.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Contract
{
    List<String> documents;

    public Contract()
    {
        documents = new ArrayList<>();
    }

    public abstract void addDocument(String document);

    public abstract void print();
}
