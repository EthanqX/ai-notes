package com.abx.ainotebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Note {
    @Id
    private String id;

    private String title;
    private String content;
    private String userId;
}
