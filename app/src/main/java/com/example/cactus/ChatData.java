package com.example.cactus;
public class ChatData {
    private String chatId;
    private String chatName;

    public ChatData() {
        // Пустой конструктор требуется для чтения данных из Firebase Realtime Database
    }

    public ChatData(String chatId, String chatName) {
        this.chatId = chatId;
        this.chatName = chatName;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }
}
