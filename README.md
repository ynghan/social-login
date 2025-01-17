📦demo
┣ 📂src
┃ ┣ 📂main
┃ ┃ ┣ 📂java
┃ ┃ ┃ ┗ 📂com
┃ ┃ ┃ ┃ ┗ 📂example
┃ ┃ ┃ ┃ ┃ ┗ 📂demo
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂api
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂auth
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AuthController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂user
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂auth
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AuthReqModel.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂user
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜User.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRefreshToken.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂user
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRefreshTokenRepository.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRepository.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiResponse.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ApiResponseHeader.java
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂properties
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AppProperties.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CorsProperties.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂security
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SecurityConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂oauth
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProviderType.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoleType.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserPrincipal.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exception
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OAuthProviderMissMatchException.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestAuthenticationEntryPoint.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenValidFailedException.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂filter
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenAuthenticationFilter.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂handler
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OAuth2AuthenticationFailureHandler.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OAuth2AuthenticationSuccessHandler.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenAccessDeniedHandler.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂info
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂impl
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜GoogleOAuth2UserInfo.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OAuth2UserInfo.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OAuth2UserInfoFactory.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OAuth2AuthorizationRequestBasedOnCookieRepository.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomOAuth2UserService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomUserDetailsService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂token
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthToken.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AuthTokenProvider.java
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂utils
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CookieUtil.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜HeaderUtil.java
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DemoApplication.java