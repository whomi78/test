abstract  class MessageSender {
    String title;
    String senderName;
    MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }
    
    /**
     * �޼����� �۽��Ѵ�.
     * @param recipient : �޴� ��� ���� (email,phoneNumber)
     */
    abstract void sendMessage(String recipient);  
}
