package PR22;

public class CreateTextDocument implements ICreateDocument {
    public IDocument createNew() {
        return new TextDocument();
    }

    public IDocument createOpen() {
        return new TextDocument();
    }
}
