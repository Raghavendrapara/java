/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1beta1LocalSubjectAccessReview;
import io.kubernetes.client.models.V1beta1SelfSubjectAccessReview;
import io.kubernetes.client.models.V1beta1SubjectAccessReview;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizationV1beta1Api
 */
@Ignore
public class AuthorizationV1beta1ApiTest {

    private final AuthorizationV1beta1Api api = new AuthorizationV1beta1Api();

    
    /**
     * 
     *
     * create a LocalSubjectAccessReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedLocalSubjectAccessReviewTest() throws ApiException {
        String namespace = null;
        V1beta1LocalSubjectAccessReview body = null;
        String pretty = null;
        V1beta1LocalSubjectAccessReview response = api.createNamespacedLocalSubjectAccessReview(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a SelfSubjectAccessReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSelfSubjectAccessReviewTest() throws ApiException {
        V1beta1SelfSubjectAccessReview body = null;
        String pretty = null;
        V1beta1SelfSubjectAccessReview response = api.createSelfSubjectAccessReview(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a SubjectAccessReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubjectAccessReviewTest() throws ApiException {
        V1beta1SubjectAccessReview body = null;
        String pretty = null;
        V1beta1SubjectAccessReview response = api.createSubjectAccessReview(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
}
