package com.example.message;

@Dao
public interface MessageDao {
    @Query("SELECT * FROM messages")
    List<Message> getAllMessages();

    @Query("SELECT * FROM messages WHERE id = :id")
    Message getMessageById(int id);

    @Insert
    void insertMessage(Message message);

    @Update
    void updateMessage(Message message);

    @Delete
    void deleteMessage(Message message);
}

