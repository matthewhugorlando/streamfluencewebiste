package com.streamfluence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

	@Bean
	public Docket streamFluence() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("streamfluence")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/*.*"))
				.build();
//				.globalOperationParameters(
//						newArrayList(new ParameterBuilder()
//								.name("x-authorization-key")
//								.description("API Authorization Key")
//								.modelRef(new ModelRef("string"))
//								.parameterType("header")
//								.required(true)
//								.build()));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Streamfluence Twitch API Testing")
				.description("Twitch Testing")
				.termsOfServiceUrl("http://streamfluence.io")
				.contact("Matthew Hug")
				.license("Apache License Version 2.0")
				.licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
				.version("2.1")
				.build();
	}
}
