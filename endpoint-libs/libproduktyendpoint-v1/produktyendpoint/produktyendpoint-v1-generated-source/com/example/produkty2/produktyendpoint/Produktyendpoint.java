/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2015-01-17 at 15:20:38 UTC 
 * Modify at your own risk.
 */

package com.example.produkty2.produktyendpoint;

/**
 * Service definition for Produktyendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ProduktyendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Produktyendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the produktyendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://electric-unity-772.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "produktyendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Produktyendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Produktyendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getProdukty".
   *
   * This request holds the parameters needed by the produktyendpoint server.  After setting any
   * optional parameters, call the {@link GetProdukty#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetProdukty getProdukty(java.lang.Long id) throws java.io.IOException {
    GetProdukty result = new GetProdukty(id);
    initialize(result);
    return result;
  }

  public class GetProdukty extends ProduktyendpointRequest<com.example.produkty2.produktyendpoint.model.Produkty> {

    private static final String REST_PATH = "produkty/{id}";

    /**
     * Create a request for the method "getProdukty".
     *
     * This request holds the parameters needed by the the produktyendpoint server.  After setting any
     * optional parameters, call the {@link GetProdukty#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetProdukty#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetProdukty(java.lang.Long id) {
      super(Produktyendpoint.this, "GET", REST_PATH, null, com.example.produkty2.produktyendpoint.model.Produkty.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetProdukty setAlt(java.lang.String alt) {
      return (GetProdukty) super.setAlt(alt);
    }

    @Override
    public GetProdukty setFields(java.lang.String fields) {
      return (GetProdukty) super.setFields(fields);
    }

    @Override
    public GetProdukty setKey(java.lang.String key) {
      return (GetProdukty) super.setKey(key);
    }

    @Override
    public GetProdukty setOauthToken(java.lang.String oauthToken) {
      return (GetProdukty) super.setOauthToken(oauthToken);
    }

    @Override
    public GetProdukty setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetProdukty) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetProdukty setQuotaUser(java.lang.String quotaUser) {
      return (GetProdukty) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetProdukty setUserIp(java.lang.String userIp) {
      return (GetProdukty) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetProdukty setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetProdukty set(String parameterName, Object value) {
      return (GetProdukty) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertProdukty".
   *
   * This request holds the parameters needed by the produktyendpoint server.  After setting any
   * optional parameters, call the {@link InsertProdukty#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.produkty2.produktyendpoint.model.Produkty}
   * @return the request
   */
  public InsertProdukty insertProdukty(com.example.produkty2.produktyendpoint.model.Produkty content) throws java.io.IOException {
    InsertProdukty result = new InsertProdukty(content);
    initialize(result);
    return result;
  }

  public class InsertProdukty extends ProduktyendpointRequest<com.example.produkty2.produktyendpoint.model.Produkty> {

    private static final String REST_PATH = "produkty";

    /**
     * Create a request for the method "insertProdukty".
     *
     * This request holds the parameters needed by the the produktyendpoint server.  After setting any
     * optional parameters, call the {@link InsertProdukty#execute()} method to invoke the remote
     * operation. <p> {@link InsertProdukty#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.produkty2.produktyendpoint.model.Produkty}
     * @since 1.13
     */
    protected InsertProdukty(com.example.produkty2.produktyendpoint.model.Produkty content) {
      super(Produktyendpoint.this, "POST", REST_PATH, content, com.example.produkty2.produktyendpoint.model.Produkty.class);
    }

    @Override
    public InsertProdukty setAlt(java.lang.String alt) {
      return (InsertProdukty) super.setAlt(alt);
    }

    @Override
    public InsertProdukty setFields(java.lang.String fields) {
      return (InsertProdukty) super.setFields(fields);
    }

    @Override
    public InsertProdukty setKey(java.lang.String key) {
      return (InsertProdukty) super.setKey(key);
    }

    @Override
    public InsertProdukty setOauthToken(java.lang.String oauthToken) {
      return (InsertProdukty) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertProdukty setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertProdukty) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertProdukty setQuotaUser(java.lang.String quotaUser) {
      return (InsertProdukty) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertProdukty setUserIp(java.lang.String userIp) {
      return (InsertProdukty) super.setUserIp(userIp);
    }

    @Override
    public InsertProdukty set(String parameterName, Object value) {
      return (InsertProdukty) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listProdukty".
   *
   * This request holds the parameters needed by the produktyendpoint server.  After setting any
   * optional parameters, call the {@link ListProdukty#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListProdukty listProdukty() throws java.io.IOException {
    ListProdukty result = new ListProdukty();
    initialize(result);
    return result;
  }

  public class ListProdukty extends ProduktyendpointRequest<com.example.produkty2.produktyendpoint.model.CollectionResponseProdukty> {

    private static final String REST_PATH = "produkty";

    /**
     * Create a request for the method "listProdukty".
     *
     * This request holds the parameters needed by the the produktyendpoint server.  After setting any
     * optional parameters, call the {@link ListProdukty#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListProdukty#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListProdukty() {
      super(Produktyendpoint.this, "GET", REST_PATH, null, com.example.produkty2.produktyendpoint.model.CollectionResponseProdukty.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListProdukty setAlt(java.lang.String alt) {
      return (ListProdukty) super.setAlt(alt);
    }

    @Override
    public ListProdukty setFields(java.lang.String fields) {
      return (ListProdukty) super.setFields(fields);
    }

    @Override
    public ListProdukty setKey(java.lang.String key) {
      return (ListProdukty) super.setKey(key);
    }

    @Override
    public ListProdukty setOauthToken(java.lang.String oauthToken) {
      return (ListProdukty) super.setOauthToken(oauthToken);
    }

    @Override
    public ListProdukty setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListProdukty) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListProdukty setQuotaUser(java.lang.String quotaUser) {
      return (ListProdukty) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListProdukty setUserIp(java.lang.String userIp) {
      return (ListProdukty) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListProdukty setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListProdukty setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListProdukty set(String parameterName, Object value) {
      return (ListProdukty) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeProdukty".
   *
   * This request holds the parameters needed by the produktyendpoint server.  After setting any
   * optional parameters, call the {@link RemoveProdukty#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveProdukty removeProdukty(java.lang.Long id) throws java.io.IOException {
    RemoveProdukty result = new RemoveProdukty(id);
    initialize(result);
    return result;
  }

  public class RemoveProdukty extends ProduktyendpointRequest<Void> {

    private static final String REST_PATH = "produkty/{id}";

    /**
     * Create a request for the method "removeProdukty".
     *
     * This request holds the parameters needed by the the produktyendpoint server.  After setting any
     * optional parameters, call the {@link RemoveProdukty#execute()} method to invoke the remote
     * operation. <p> {@link RemoveProdukty#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveProdukty(java.lang.Long id) {
      super(Produktyendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveProdukty setAlt(java.lang.String alt) {
      return (RemoveProdukty) super.setAlt(alt);
    }

    @Override
    public RemoveProdukty setFields(java.lang.String fields) {
      return (RemoveProdukty) super.setFields(fields);
    }

    @Override
    public RemoveProdukty setKey(java.lang.String key) {
      return (RemoveProdukty) super.setKey(key);
    }

    @Override
    public RemoveProdukty setOauthToken(java.lang.String oauthToken) {
      return (RemoveProdukty) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveProdukty setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveProdukty) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveProdukty setQuotaUser(java.lang.String quotaUser) {
      return (RemoveProdukty) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveProdukty setUserIp(java.lang.String userIp) {
      return (RemoveProdukty) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveProdukty setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveProdukty set(String parameterName, Object value) {
      return (RemoveProdukty) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateProdukty".
   *
   * This request holds the parameters needed by the produktyendpoint server.  After setting any
   * optional parameters, call the {@link UpdateProdukty#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.produkty2.produktyendpoint.model.Produkty}
   * @return the request
   */
  public UpdateProdukty updateProdukty(com.example.produkty2.produktyendpoint.model.Produkty content) throws java.io.IOException {
    UpdateProdukty result = new UpdateProdukty(content);
    initialize(result);
    return result;
  }

  public class UpdateProdukty extends ProduktyendpointRequest<com.example.produkty2.produktyendpoint.model.Produkty> {

    private static final String REST_PATH = "produkty";

    /**
     * Create a request for the method "updateProdukty".
     *
     * This request holds the parameters needed by the the produktyendpoint server.  After setting any
     * optional parameters, call the {@link UpdateProdukty#execute()} method to invoke the remote
     * operation. <p> {@link UpdateProdukty#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.produkty2.produktyendpoint.model.Produkty}
     * @since 1.13
     */
    protected UpdateProdukty(com.example.produkty2.produktyendpoint.model.Produkty content) {
      super(Produktyendpoint.this, "PUT", REST_PATH, content, com.example.produkty2.produktyendpoint.model.Produkty.class);
    }

    @Override
    public UpdateProdukty setAlt(java.lang.String alt) {
      return (UpdateProdukty) super.setAlt(alt);
    }

    @Override
    public UpdateProdukty setFields(java.lang.String fields) {
      return (UpdateProdukty) super.setFields(fields);
    }

    @Override
    public UpdateProdukty setKey(java.lang.String key) {
      return (UpdateProdukty) super.setKey(key);
    }

    @Override
    public UpdateProdukty setOauthToken(java.lang.String oauthToken) {
      return (UpdateProdukty) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateProdukty setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateProdukty) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateProdukty setQuotaUser(java.lang.String quotaUser) {
      return (UpdateProdukty) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateProdukty setUserIp(java.lang.String userIp) {
      return (UpdateProdukty) super.setUserIp(userIp);
    }

    @Override
    public UpdateProdukty set(String parameterName, Object value) {
      return (UpdateProdukty) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Produktyendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Produktyendpoint}. */
    @Override
    public Produktyendpoint build() {
      return new Produktyendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ProduktyendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setProduktyendpointRequestInitializer(
        ProduktyendpointRequestInitializer produktyendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(produktyendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
