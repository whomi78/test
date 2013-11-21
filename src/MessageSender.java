abstract  class MessageSender {
    String title;
    String senderName;
    MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }
    
    /**
     * 메세지를 송신한다.
     * @param recipient : 받는 사람 정보 (email,phoneNumber)
     */
    abstract void sendMessage(String recipient);  
}
