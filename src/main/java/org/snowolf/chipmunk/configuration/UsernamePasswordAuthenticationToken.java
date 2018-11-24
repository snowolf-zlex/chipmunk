package org.snowolf.chipmunk.configuration;

import java.util.Collection;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class UsernamePasswordAuthenticationToken extends AbstractAuthenticationToken {

  private static final long serialVersionUID = 9102942373014298605L;

  /**
   * Creates a token with the supplied array of authorities.
   *
   * @param authorities the collection of <tt>GrantedAuthority</tt>s for the principal represented
   * by this authentication object.
   */
  public UsernamePasswordAuthenticationToken(
          Collection<? extends GrantedAuthority> authorities) {
    super(authorities);
  }

  @Override
  public Object getCredentials() {
    return null;
  }

  @Override
  public Object getPrincipal() {
    return null;
  }
}
