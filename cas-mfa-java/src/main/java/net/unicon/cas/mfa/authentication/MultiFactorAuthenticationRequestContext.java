package net.unicon.cas.mfa.authentication;

import org.jasig.cas.authentication.principal.WebApplicationService;

import java.io.Serializable;

import static net.unicon.cas.mfa.web.support.MultiFactorAuthenticationSupportingWebApplicationService.AuthenticationMethodSource;

/**
 * Holds a requested authentication method along with a target <code>WebApplicationService</code> and an authentication method request source.
 *
 * @author Dmitriy Kopylenko
 * @author Unicon inc.
 */
public final class MultiFactorAuthenticationRequestContext implements Serializable {

    /**
     * Requested authentication method.
     */
    private final String authenticationMethod;

    /**
     * Target service.
     */
    private final WebApplicationService targetService;

    /**
     * Authentication method source.
     */
    private final AuthenticationMethodSource authenticationMethodSource;

    /**
     * Ctor.
     *
     * @param authenticationMethod authenticationMethod
     * @param targetService targetService
     * @param authenticationMethodSource authenticationMethodSource
     */
    public MultiFactorAuthenticationRequestContext(final String authenticationMethod,
                                                   final WebApplicationService targetService,
                                                   final AuthenticationMethodSource authenticationMethodSource) {

        this.authenticationMethod = authenticationMethod;
        this.targetService = targetService;
        this.authenticationMethodSource = authenticationMethodSource;
    }

    /**
     * Yes, this is in fact a getter method! ;-).
     *
     * @return authenticationMethod
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Get target service.
     *
     * @return targetService
     */
    public WebApplicationService getTargetService() {
        return targetService;
    }

    /**
     * Get authentication method source.
     *
     * @return authenticationMethodSource
     */
    public AuthenticationMethodSource getAuthenticationMethodSource() {
        return authenticationMethodSource;
    }
}
