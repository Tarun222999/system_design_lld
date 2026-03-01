package structural_pattern.proxy2.proxy;

import structural_pattern.proxy2.concrete.RealDocumentService;
import structural_pattern.proxy2.isubject.DocumentService;

public class ProxyDocService implements DocumentService {
    private RealDocumentService realDocService = new RealDocumentService();

    public String getDocument(String documentId, String userRole) {
        if (documentId.contains("CONFIDENTIAL") && !userRole.equals("admin")) {
            return "NO ACCESS";
        }
        return realDocService.getDocument(documentId, userRole);
    }
}
