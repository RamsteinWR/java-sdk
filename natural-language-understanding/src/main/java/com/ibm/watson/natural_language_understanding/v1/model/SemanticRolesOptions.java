/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.natural_language_understanding.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Parses sentences into subject, action, and object form.
 *
 * Supported languages: English, German, Japanese, Korean, Spanish.
 */
public class SemanticRolesOptions extends GenericModel {

  private Long limit;
  private Boolean keywords;
  private Boolean entities;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private Boolean keywords;
    private Boolean entities;

    private Builder(SemanticRolesOptions semanticRolesOptions) {
      this.limit = semanticRolesOptions.limit;
      this.keywords = semanticRolesOptions.keywords;
      this.entities = semanticRolesOptions.entities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SemanticRolesOptions.
     *
     * @return the semanticRolesOptions
     */
    public SemanticRolesOptions build() {
      return new SemanticRolesOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the SemanticRolesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the keywords.
     *
     * @param keywords the keywords
     * @return the SemanticRolesOptions builder
     */
    public Builder keywords(Boolean keywords) {
      this.keywords = keywords;
      return this;
    }

    /**
     * Set the entities.
     *
     * @param entities the entities
     * @return the SemanticRolesOptions builder
     */
    public Builder entities(Boolean entities) {
      this.entities = entities;
      return this;
    }
  }

  private SemanticRolesOptions(Builder builder) {
    limit = builder.limit;
    keywords = builder.keywords;
    entities = builder.entities;
  }

  /**
   * New builder.
   *
   * @return a SemanticRolesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * Maximum number of semantic_roles results to return.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the keywords.
   *
   * Set this to `true` to return keyword information for subjects and objects.
   *
   * @return the keywords
   */
  public Boolean keywords() {
    return keywords;
  }

  /**
   * Gets the entities.
   *
   * Set this to `true` to return entity information for subjects and objects.
   *
   * @return the entities
   */
  public Boolean entities() {
    return entities;
  }
}
