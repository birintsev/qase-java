/*
 * Qase.io API
 * Qase API Specification.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@qase.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.qase.client.api;

import com.google.gson.reflect.TypeToken;
import io.qase.api.exceptions.QaseException;
import io.qase.client.*;
import io.qase.client.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectsApi {
    private ApiClient localVarApiClient;

    public ProjectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createProject
     *
     * @param projectCreate (required)
     * @param _callback     Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project creation. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createProjectCall(ProjectCreate projectCreate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = projectCreate;

        // create path and map variables
        String localVarPath = "/project";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createProjectValidateBeforeCall(ProjectCreate projectCreate, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'projectCreate' is set
        if (projectCreate == null) {
            throw new QaseException("Missing the required parameter 'projectCreate' when calling createProject(Async)");
        }


        okhttp3.Call localVarCall = createProjectCall(projectCreate, _callback);
        return localVarCall;

    }

    /**
     * Create new project.
     * This method is used to create a new project through API.
     *
     * @param projectCreate (required)
     * @return ProjectCodeResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project creation. </td><td>  -  </td></tr>
     * </table>
     */
    public ProjectCodeResponse createProject(ProjectCreate projectCreate) throws QaseException {
        ApiResponse<ProjectCodeResponse> localVarResp = createProjectWithHttpInfo(projectCreate);
        return localVarResp.getData();
    }

    /**
     * Create new project.
     * This method is used to create a new project through API.
     *
     * @param projectCreate (required)
     * @return ApiResponse&lt;ProjectCodeResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project creation. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ProjectCodeResponse> createProjectWithHttpInfo(ProjectCreate projectCreate) throws QaseException {
        okhttp3.Call localVarCall = createProjectValidateBeforeCall(projectCreate, null);
        Type localVarReturnType = new TypeToken<ProjectCodeResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create new project. (asynchronously)
     * This method is used to create a new project through API.
     *
     * @param projectCreate (required)
     * @param _callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project creation. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createProjectAsync(ProjectCreate projectCreate, final ApiCallback<ProjectCodeResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = createProjectValidateBeforeCall(projectCreate, _callback);
        Type localVarReturnType = new TypeToken<ProjectCodeResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for deleteProject
     *
     * @param code      Code of project, where to search entities. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project removal. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteProjectCall(String code, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project/{code}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteProjectValidateBeforeCall(String code, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling deleteProject(Async)");
        }


        okhttp3.Call localVarCall = deleteProjectCall(code, _callback);
        return localVarCall;

    }

    /**
     * Delete Project by code.
     * This method allows to delete a specific project.
     *
     * @param code Code of project, where to search entities. (required)
     * @return Response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project removal. </td><td>  -  </td></tr>
     * </table>
     */
    public Response deleteProject(String code) throws QaseException {
        ApiResponse<Response> localVarResp = deleteProjectWithHttpInfo(code);
        return localVarResp.getData();
    }

    /**
     * Delete Project by code.
     * This method allows to delete a specific project.
     *
     * @param code Code of project, where to search entities. (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project removal. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Response> deleteProjectWithHttpInfo(String code) throws QaseException {
        okhttp3.Call localVarCall = deleteProjectValidateBeforeCall(code, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Project by code. (asynchronously)
     * This method allows to delete a specific project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result of project removal. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteProjectAsync(String code, final ApiCallback<Response> _callback) throws QaseException {

        okhttp3.Call localVarCall = deleteProjectValidateBeforeCall(code, _callback);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getProject
     *
     * @param code      Code of project, where to search entities. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Project. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getProjectCall(String code, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project/{code}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProjectValidateBeforeCall(String code, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getProject(Async)");
        }


        okhttp3.Call localVarCall = getProjectCall(code, _callback);
        return localVarCall;

    }

    /**
     * Get Project by code.
     * This method allows to retrieve a specific project.
     *
     * @param code Code of project, where to search entities. (required)
     * @return ProjectResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Project. </td><td>  -  </td></tr>
     * </table>
     */
    public ProjectResponse getProject(String code) throws QaseException {
        ApiResponse<ProjectResponse> localVarResp = getProjectWithHttpInfo(code);
        return localVarResp.getData();
    }

    /**
     * Get Project by code.
     * This method allows to retrieve a specific project.
     *
     * @param code Code of project, where to search entities. (required)
     * @return ApiResponse&lt;ProjectResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Project. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ProjectResponse> getProjectWithHttpInfo(String code) throws QaseException {
        okhttp3.Call localVarCall = getProjectValidateBeforeCall(code, null);
        Type localVarReturnType = new TypeToken<ProjectResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Project by code. (asynchronously)
     * This method allows to retrieve a specific project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Project. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getProjectAsync(String code, final ApiCallback<ProjectResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getProjectValidateBeforeCall(code, _callback);
        Type localVarReturnType = new TypeToken<ProjectResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getProjects
     *
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getProjectsCall(Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProjectsValidateBeforeCall(Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {


        okhttp3.Call localVarCall = getProjectsCall(limit, offset, _callback);
        return localVarCall;

    }

    /**
     * Get All Projects.
     * This method allows to retrieve all projects available for your account. You can limit and offset params to paginate.
     *
     * @param limit  A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @return ProjectListResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     * </table>
     */
    public ProjectListResponse getProjects(Integer limit, Integer offset) throws QaseException {
        ApiResponse<ProjectListResponse> localVarResp = getProjectsWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * Get All Projects.
     * This method allows to retrieve all projects available for your account. You can limit and offset params to paginate.
     *
     * @param limit  A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @return ApiResponse&lt;ProjectListResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ProjectListResponse> getProjectsWithHttpInfo(Integer limit, Integer offset) throws QaseException {
        okhttp3.Call localVarCall = getProjectsValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<ProjectListResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get All Projects. (asynchronously)
     * This method allows to retrieve all projects available for your account. You can limit and offset params to paginate.
     *
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getProjectsAsync(Integer limit, Integer offset, final ApiCallback<ProjectListResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getProjectsValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<ProjectListResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for grantAccessToProject
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @param _callback     Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call grantAccessToProjectCall(String code, ProjectAccess projectAccess, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = projectAccess;

        // create path and map variables
        String localVarPath = "/project/{code}/access"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call grantAccessToProjectValidateBeforeCall(String code, ProjectAccess projectAccess, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling grantAccessToProject(Async)");
        }

        // verify the required parameter 'projectAccess' is set
        if (projectAccess == null) {
            throw new QaseException("Missing the required parameter 'projectAccess' when calling grantAccessToProject(Async)");
        }


        okhttp3.Call localVarCall = grantAccessToProjectCall(code, projectAccess, _callback);
        return localVarCall;

    }

    /**
     * Grant access to project by code.
     * This method allows to grant access to a specific project.
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @return Response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public Response grantAccessToProject(String code, ProjectAccess projectAccess) throws QaseException {
        ApiResponse<Response> localVarResp = grantAccessToProjectWithHttpInfo(code, projectAccess);
        return localVarResp.getData();
    }

    /**
     * Grant access to project by code.
     * This method allows to grant access to a specific project.
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Response> grantAccessToProjectWithHttpInfo(String code, ProjectAccess projectAccess) throws QaseException {
        okhttp3.Call localVarCall = grantAccessToProjectValidateBeforeCall(code, projectAccess, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Grant access to project by code. (asynchronously)
     * This method allows to grant access to a specific project.
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @param _callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call grantAccessToProjectAsync(String code, ProjectAccess projectAccess, final ApiCallback<Response> _callback) throws QaseException {

        okhttp3.Call localVarCall = grantAccessToProjectValidateBeforeCall(code, projectAccess, _callback);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for revokeAccessToProject
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @param _callback     Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call revokeAccessToProjectCall(String code, ProjectAccess projectAccess, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = projectAccess;

        // create path and map variables
        String localVarPath = "/project/{code}/access"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokeAccessToProjectValidateBeforeCall(String code, ProjectAccess projectAccess, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling revokeAccessToProject(Async)");
        }

        // verify the required parameter 'projectAccess' is set
        if (projectAccess == null) {
            throw new QaseException("Missing the required parameter 'projectAccess' when calling revokeAccessToProject(Async)");
        }


        okhttp3.Call localVarCall = revokeAccessToProjectCall(code, projectAccess, _callback);
        return localVarCall;

    }

    /**
     * Revoke access to project by code.
     * This method allows to revoke access to a specific project.
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @return Response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public Response revokeAccessToProject(String code, ProjectAccess projectAccess) throws QaseException {
        ApiResponse<Response> localVarResp = revokeAccessToProjectWithHttpInfo(code, projectAccess);
        return localVarResp.getData();
    }

    /**
     * Revoke access to project by code.
     * This method allows to revoke access to a specific project.
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Response> revokeAccessToProjectWithHttpInfo(String code, ProjectAccess projectAccess) throws QaseException {
        okhttp3.Call localVarCall = revokeAccessToProjectValidateBeforeCall(code, projectAccess, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Revoke access to project by code. (asynchronously)
     * This method allows to revoke access to a specific project.
     *
     * @param code          Code of project, where to search entities. (required)
     * @param projectAccess (required)
     * @param _callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Result of operation. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call revokeAccessToProjectAsync(String code, ProjectAccess projectAccess, final ApiCallback<Response> _callback) throws QaseException {

        okhttp3.Call localVarCall = revokeAccessToProjectValidateBeforeCall(code, projectAccess, _callback);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}