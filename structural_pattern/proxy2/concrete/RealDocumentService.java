package structural_pattern.proxy2.concrete;

import java.util.HashMap;
import java.util.Map;

import structural_pattern.proxy2.isubject.DocumentService;

public class RealDocumentService implements DocumentService {
    private final Map<String, String> documents = new HashMap<>();

    public RealDocumentService() {
        documents.put("PUBLIC_1", "Public policy document");
        documents.put("CONFIDENTIAL_1", "Confidential legal memo");
    }

    public String getDocument(String documentId, String userRole) {
        return documents.get(documentId);
    }
}
