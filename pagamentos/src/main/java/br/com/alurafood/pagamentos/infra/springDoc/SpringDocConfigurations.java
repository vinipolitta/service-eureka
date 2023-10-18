//package br.com.alurafood.pagamentos.infra.springDoc;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringDocConfigurations {
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .components(new Components()
//                        .addSecuritySchemes("bearer-key",
//                                new SecurityScheme()
//                                        .type(SecurityScheme.Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT")))
//                .info(new Info()
//                        .title("Voll.med API")
//                        .description("API Rest da aplicação Pagamentos vpsfood, contendo as funcionalidades de CRUD de pagamentos.")
//                        .contact(new Contact()
//                                .name("Vini Politta")
//                                .email("vinipoli.project@gmail.com"))
//                        .license(new License()
//                                .name("Apache 2.0")
////                                .url("http://voll.med/api/licenca")
//                        ));
//    }
//
//
//}
