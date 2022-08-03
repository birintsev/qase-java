package io.qase.client.api;

import com.google.gson.reflect.TypeToken;
import io.qase.api.exceptions.QaseException;
import io.qase.client.ApiCallback;
import io.qase.client.ApiClient;
import io.qase.client.ApiResponse;
import io.qase.client.Pair;
import io.qase.client.model.IdResponse;
import io.qase.enums.HttpMethod;
import lombok.AccessLevel;
import lombok.Getter;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

import static io.qase.configuration.QaseModule.INJECTOR;
import static org.apache.http.HttpHeaders.ACCEPT;
import static org.apache.http.HttpHeaders.CONTENT_TYPE;

// TODO: refactor the class (e.g. to an encapsulated service/set of services), not all inheritors use all the methods
public abstract class AbstractEntityApi {

    private static final Object NO_FILTERS = null;

    private static final String URL_PATH_SEPARATOR = "/";

    private static final String APPLICATION_JSON = "application/json";

    private static final String TOKEN_AUTH = "TokenAuth";

    private static final String EMPTY_STRING = "";

    protected static final String FILTERS_QUERY_PARAMETER_NAME = "filters";

    protected static final String LIMIT_QUERY_PARAMETER_NAME = "limit";

    protected static final String OFFSET_QUERY_PARAMETER_NAME = "offset";

    protected static final String INCLUDE_QUERY_PARAMETER_NAME = "include";

    protected static final String QUERY_QUERY_PARAMETER_NAME = "query";

    @Getter(AccessLevel.PROTECTED)
    private ApiClient apiClient;

    public AbstractEntityApi() {
        this(INJECTOR.getInstance(ApiClient.class));
    }

    public AbstractEntityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public okhttp3.Call createEntityCall(String code, Object payload, final ApiCallback _callback)
    throws QaseException {
        return createCallInternal(
            HttpMethod.POST,
            joinEntitySubpath(code),
            payload,
            _callback
        );
    }

    @SuppressWarnings("rawtypes")
    protected okhttp3.Call createEntityValidateBeforeCall(
        String code, Object payload, final ApiCallback _callback
    ) throws QaseException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling createEntity(Async)");
        }
        // verify the required parameter 'entityCreate' is set
        if (payload == null) {
            throw new QaseException("Missing the required parameter 'entityCreate' when calling createEntity(Async)");
        }

        return createEntityCall(code, payload, _callback);
    }

    /**
     * Create a new entity.
     * This method allows to create a entity in selected project.
     *
     * @param code         Code of project, where to search entities. (required)
     * @param payload (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse createEntity(String code, Object payload) throws QaseException {
        ApiResponse<IdResponse> localVarResp = createEntityWithHttpInfo(code, payload);
        return localVarResp.getData();
    }

    public ApiResponse<IdResponse> createEntityWithHttpInfo(String code, Object payload) throws QaseException {
        okhttp3.Call localVarCall = createEntityValidateBeforeCall(code, payload, null);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        return apiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new entity. (asynchronously)
     * This method allows to create an entity in selected project.
     *
     * @param code         Code of project, where to search entities. (required)
     * @param payload (required)
     * @param _callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createEntityAsync(
        String code, Object payload, final ApiCallback<IdResponse> _callback
    ) throws QaseException {
        okhttp3.Call localVarCall = createEntityValidateBeforeCall(code, payload, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        apiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for deleteEntity
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteEntityCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        return deleteEntityCall(code, id, null, _callback);
    }

    public okhttp3.Call deleteEntityCall(String code, Integer id, Object payload, final ApiCallback _callback)
    throws QaseException {
        return createCallInternal(
            HttpMethod.DELETE,
            joinEntitySubpath(code, id.toString()),
            payload,
            _callback
        );
    }

    /**
     * Delete entity.
     * This method completely deletes an entity from repository.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse deleteEntity(String code, Integer id) throws QaseException {
        return deleteEntity(code, id, null);
    }

    public IdResponse deleteEntity(String code, Integer id, Object payload) throws QaseException {
        ApiResponse<IdResponse> localVarResp = deleteEntityWithHttpInfo(code, id, payload);
        return localVarResp.getData();
    }

    /**
     * Delete entity.
     * This method completely deletes an entity from repository.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> deleteEntityWithHttpInfo(String code, Integer id) throws QaseException {
        return deleteEntityWithHttpInfo(code, id, null);
    }

    public ApiResponse<IdResponse> deleteEntityWithHttpInfo(String code, Integer id, Object payload)
    throws QaseException {
        okhttp3.Call localVarCall = deleteEntityValidateBeforeCall(code, id, payload, null);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        return apiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete entity. (asynchronously)
     * This method completely deletes a entity from repository.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteEntityAsync(String code, Integer id, final ApiCallback<IdResponse> _callback)
    throws QaseException {
        return deleteEntityAsync(code, id, null, _callback);
    }

    public okhttp3.Call deleteEntityAsync(
        String code, Integer id, Object payload, final ApiCallback<IdResponse> _callback
    ) throws QaseException {
        okhttp3.Call localVarCall = deleteEntityValidateBeforeCall(code, id, payload, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        apiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getEntity
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An entity. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getEntityCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        return createCallInternal(
            HttpMethod.GET,
            joinEntitySubpath(apiClient.escapeString(code), apiClient.escapeString(id.toString())),
            null,
            _callback
        );
    }

    /**
     * Get a specific entity.
     * This method allows to retrieve a specific entity.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return an entity response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An entity. </td><td>  -  </td></tr>
     * </table>
     */
    public <T> T getEntity(String code, Integer id) throws QaseException {
        ApiResponse<T> localVarResp = getEntityWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Get a specific entity.
     * This method allows to retrieve a specific entity.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return ApiResponse&lt;R&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An entity. </td><td>  -  </td></tr>
     * </table>
     */
    public <T> ApiResponse<T> getEntityWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = getEntityValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<T>() { }.getType();
        return apiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a specific entity. (asynchronously)
     * This method allows to retrieve a specific entity.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An entity. </td><td>  -  </td></tr>
     * </table>
     */
    public <T> okhttp3.Call getEntityAsync(String code, Integer id, final ApiCallback<T> _callback)
    throws QaseException {
        okhttp3.Call localVarCall = getEntityValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<T>() { }.getType();
        apiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getEntity
     *
     * @param code      Code of project, where to search entities. (required)
     * @param filters   (optional)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all entity. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getEntitiesCall(
        String code, Object filters, Integer limit, Integer offset, final ApiCallback _callback
    ) throws QaseException {
        List<Pair> queryParameters = filterNullsAndConvertToPairs(new HashMap<String, Object>() {{
            put(FILTERS_QUERY_PARAMETER_NAME, filters);
            put(LIMIT_QUERY_PARAMETER_NAME, limit);
            put(OFFSET_QUERY_PARAMETER_NAME, offset);
        }});

        return createCallInternal(
            HttpMethod.GET,
            joinEntitySubpath(apiClient.escapeString(code)),
            null,
            queryParameters,
            _callback
        );
    }

    public okhttp3.Call getEntitiesCall(
        String code, Integer limit, Integer offset, final ApiCallback _callback
    ) throws QaseException {
        return getEntitiesCall(code, NO_FILTERS, limit, offset, _callback);
    }

    /**
     * Get all entities.
     * This method allows to retrieve all entities stored in selected project.
     *
     * @param code    Code of project, where to search entities. (required)
     * @param filters (optional)
     * @param limit   A number of entities in result set. (optional, default to 10)
     * @param offset  How many entities should be skipped. (optional, default to 0)
     * @return RL
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all entities. </td><td>  -  </td></tr>
     * </table>
     */
    public <T> T getEntities(String code, Object filters, Integer limit, Integer offset) throws QaseException {
        ApiResponse<T> localVarResp = getEntitiesWithHttpInfo(code, filters, limit, offset);
        return localVarResp.getData();
    }

    public <T> T getEntities(String code, Integer limit, Integer offset) throws QaseException {
        return getEntities(code, NO_FILTERS, limit, offset);
    }

    /**
     * Get all entities.
     * This method allows to retrieve all entities stored in selected project.
     *
     * @param code    Code of project, where to search entities. (required)
     * @param filters (optional)
     * @param limit   A number of entities in result set. (optional, default to 10)
     * @param offset  How many entities should be skipped. (optional, default to 0)
     * @return ApiResponse&lt;RL&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all entities. </td><td>  -  </td></tr>
     * </table>
     */
    public <T> ApiResponse<T> getEntitiesWithHttpInfo(String code, Object filters, Integer limit, Integer offset)
    throws QaseException {
        okhttp3.Call localVarCall = getEntitiesValidateBeforeCall(code, filters, limit, offset, null);
        Type localVarReturnType = new TypeToken<T>() { }.getType();
        return apiClient.execute(localVarCall, localVarReturnType);
    }

    public <T> ApiResponse<T> getEntitiesWithHttpInfo(String code, Integer limit, Integer offset) throws QaseException {
        return getEntitiesWithHttpInfo(code, NO_FILTERS, limit, offset);
    }

    /**
     * Get all entities. (asynchronously)
     * This method allows to retrieve all entities stored in selected project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param filters   (optional)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all entities. </td><td>  -  </td></tr>
     * </table>
     */
    public <T> okhttp3.Call getEntitiesAsync(
        String code, Object filters, Integer limit, Integer offset, final ApiCallback<T> _callback
    ) throws QaseException {
        okhttp3.Call localVarCall = getEntitiesValidateBeforeCall(code, filters, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<T>() { }.getType();
        apiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public <T> okhttp3.Call getEntitiesAsync(String code, Integer limit, Integer offset, final ApiCallback<T> _callback)
    throws QaseException {
        return getEntitiesAsync(code, NO_FILTERS, limit, offset, _callback);
    }

    /**
     * Build call for resolveEntity
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call resolveEntityCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        return createCallInternal(
            HttpMethod.PATCH,
            joinEntitySubpath(apiClient.escapeString(code), "resolve", apiClient.escapeString(id.toString())),
            null,
            _callback
        );
    }

    /**
     * Resolve a specific entity.
     * This method allows to resolve a specific entity.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse resolveEntity(String code, Integer id) throws QaseException {
        ApiResponse<IdResponse> localVarResp = resolveEntityWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Resolve a specific entity.
     * This method allows to resolve a specific entity.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> resolveEntityWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = resolveEntityValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        return apiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Resolve a specific entity. (asynchronously)
     * This method allows to resolve a specific entity.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call resolveEntityAsync(String code, Integer id, final ApiCallback<IdResponse> _callback)
    throws QaseException {
        okhttp3.Call localVarCall = resolveEntityValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        apiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for updateEntity
     *
     * @param code         Code of project, where to search entities. (required)
     * @param id           Identifier. (required)
     * @param payload (required)
     * @param _callback    Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateEntityCall(
        String code, Integer id, Object payload, final ApiCallback _callback
    ) throws QaseException {
        return createCallInternal(
            HttpMethod.PATCH,
            joinEntitySubpath(apiClient.escapeString(code), apiClient.escapeString(id.toString())),
            payload,
            _callback
        );
    }

    /**
     * Update entity.
     * This method updates a entity.
     *
     * @param code         Code of project, where to search entities. (required)
     * @param id           Identifier. (required)
     * @param payload (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse updateEntity(String code, Integer id, Object payload) throws QaseException {
        ApiResponse<IdResponse> localVarResp = updateEntityWithHttpInfo(code, id, payload);
        return localVarResp.getData();
    }

    /**
     * Update entity.
     * This method updates a entity.
     *
     * @param code         Code of project, where to search entities. (required)
     * @param id           Identifier. (required)
     * @param payload (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> updateEntityWithHttpInfo(String code, Integer id, Object payload)
    throws QaseException {
        okhttp3.Call localVarCall = updateEntityValidateBeforeCall(code, id, payload, null);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        return apiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update entity. (asynchronously)
     * This method updates a entity.
     *
     * @param code         Code of project, where to search entities. (required)
     * @param id           Identifier. (required)
     * @param payload (required)
     * @param _callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateEntityAsync(
        String code, Integer id, Object payload, final ApiCallback<IdResponse> _callback
    ) throws QaseException {
        okhttp3.Call localVarCall = updateEntityValidateBeforeCall(code, id, payload, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() { }.getType();
        apiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for updateEntityStatus
     *
     * @param code         Code of project, where to search entities. (required)
     * @param id           Identifier. (required)
     * @param payload (required)
     * @param _callback    Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateEntityStatusCall(String code, Integer id, Object payload, final ApiCallback _callback)
    throws QaseException {
        return createCallInternal(
            HttpMethod.PATCH,
            joinEntitySubpath(apiClient.escapeString(code), "status", apiClient.escapeString(id.toString())),
            payload,
            _callback
        );
    }

    protected abstract String getEntityRootPathSegment();

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateEntityValidateBeforeCall(
        String code, Integer id, Object payload, final ApiCallback _callback
    ) throws QaseException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling updateEntity(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling updateEntity(Async)");
        }

        // verify the required parameter 'entityUpdate' is set
        if (payload == null) {
            throw new QaseException("Missing the required parameter 'entityUpdate' when calling updateEntity(Async)");
        }

        return updateEntityCall(code, id, payload, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteEntityValidateBeforeCall(
        String code, Integer id, Object payload, final ApiCallback _callback
    ) throws QaseException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling deleteEntity(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling deleteEntity(Async)");
        }

        return deleteEntityCall(code, id, payload, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEntityValidateBeforeCall(String code, Integer id, final ApiCallback _callback)
        throws QaseException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getEntity(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling getEntity(Async)");
        }

        return getEntityCall(code, id, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEntitiesValidateBeforeCall(
        String code, Object filters, Integer limit, Integer offset, final ApiCallback _callback
    ) throws QaseException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getEntities(Async)");
        }

        return getEntitiesCall(code, filters, limit, offset, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resolveEntityValidateBeforeCall(String code, Integer id, final ApiCallback _callback)
    throws QaseException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling resolveEntity(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling resolveEntity(Async)");
        }

        return resolveEntityCall(code, id, _callback);
    }

    protected okhttp3.Call createCallInternal(
        HttpMethod httpMethod, String path, Object body, final ApiCallback _callback
    ) throws QaseException {
        return createCallInternal(httpMethod, path, body, Collections.emptyList(), _callback);
    }

    // TODO: check if builder pattern could make this method better
    protected okhttp3.Call createCallInternal(
        HttpMethod httpMethod, String path, Object body, List<Pair> queryParams, final ApiCallback _callback
    ) throws QaseException {
        List<Pair> localVarQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, String> localVarCookieParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {APPLICATION_JSON};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put(ACCEPT, localVarAccept);
        }

        final String[] localVarContentTypes = {APPLICATION_JSON};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put(CONTENT_TYPE, localVarContentType);

        String[] localVarAuthNames = new String[] {TOKEN_AUTH};
        return apiClient.buildCall(
            path,
            httpMethod.toString(),
            localVarQueryParams,
            queryParams,
            body,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAuthNames,
            _callback
        );
    }

    protected List<Pair> filterNullsAndConvertToPairs(Map<String, Object> queryParameters) {
        return queryParameters.entrySet().stream()
            .filter(nameToValue -> Objects.nonNull(nameToValue.getValue()))
            .flatMap(
                nameToValue -> apiClient.parameterToPair(nameToValue.getKey(), nameToValue.getValue()).stream()
            )
            .collect(Collectors.toList());
    }

    protected String joinEntitySubpath(String... entitySubpathSegments) {
        String[] pathSegments = new String[entitySubpathSegments.length + 1];
        pathSegments[0] = getEntityRootPathSegment();
        if (entitySubpathSegments.length != 0) {
            System.arraycopy(entitySubpathSegments, 0, pathSegments, 1, entitySubpathSegments.length);
        }
        return joinPath(pathSegments);
    }

    private String joinPath(String... pathSegments) {
        return Arrays.stream(pathSegments)
            .map(apiClient::escapeString)
            .collect(Collectors.joining(URL_PATH_SEPARATOR, URL_PATH_SEPARATOR, EMPTY_STRING));
    }
}
