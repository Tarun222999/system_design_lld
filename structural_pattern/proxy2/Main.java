package structural_pattern.proxy2;

import structural_pattern.proxy2.proxy.ProxyDocService;

public class Main {
    public static void main(String[] args) {
        ProxyDocService proxyDoc = new ProxyDocService();
        String res1 = proxyDoc.getDocument("PUBLIC_1", "admin");
        String res2 = proxyDoc.getDocument("CONFIDENTIAL_1", "admin");
        String res3 = proxyDoc.getDocument("CONFIDENTIAL_1", "user");
        System.out.println(res1 + res2 + res3);
    }
}
