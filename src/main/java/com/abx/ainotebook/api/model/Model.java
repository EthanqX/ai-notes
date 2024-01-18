package com.abx.ainotebook.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * GPT model details
 *
 * https://beta.openai.com/docs/api-reference/models
 */
@Data
public class Model {
    /**
     * An identifier for this model, used to specify the model when making completions, etc
     */
    public String id;

    /**
     * The type of object returned, should be "model"
     */
    public String object;

    /**
     * The owner of the model, typically "openai"
     */
    @JsonProperty("owned_by")
    public String ownedBy;

    //    delete permission

    /**
     * The root model that this and its parent (if applicable) are based on
     */
    public String root;

    /**
     * The parent model that this is based on
     */
    public String parent;
}
