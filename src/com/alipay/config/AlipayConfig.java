﻿package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2017041306700999";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCqsMIYGNkSPLrSR0EJwUhCpuopdi1CPMoPfUKHWJritxOpu7SSA4fZlVUYQoga8qTud8adihJuKz3SWKwT3BlfnspWdYsl/M7cyCMdM+u6qqNMQRGIULJpT9iEdBiG7VI9lIYn5cmxfZwT4B4ssG8ba7ef36raRtWbEVHBvB/BRope+pZXxWOv8K7SXOEceZAf40ogt6eZRIrHZGfbCuHFBEecjqjk7tjTOL06xJWd8am/Y5UP/4908ONsnMSolrkcQb1fUcA3cXtdHssMC8/DSxHz8XoNOtUyyJJN1hx7c51dsScFABvys+cyLYKaPuKJYXtOLzjayTG52loGxAq/AgMBAAECggEAO86RQ4Y5UOWMhC9JP5TEr+3yMDLjKslH92NpUykdpACH2DoXy+2GxRtI5KYzMFYCqje3lO2TBZ0LHU/Kg27kSRfHR8IJznalOMC7ZPkTSKWPcCGAdiXoTXQXpllTWrt+zGrlEse2AwXDEUe+6uOrGo2EmnTxVWfqYloQLnSvH7X1kwmenLCDnaldOTuLcCWlBENCZlDxsx96JWq79wQAIUvuuumaIYFfCymq/6vbVN+uLFsCvDgVl32zy4ebif/wu+igHDyRp0m+BOBbscGsS4ZWD/itPki9pOMsKPiw5Kg7j8nAWgtwOnV1GjtGee54nvBRUnZUs/hqLzEOs5yJ+QKBgQD8zqMXlAspzEom2y/oUNqzpJMI9SIHOFjQeqp4dNIdjA1+jQVxiCojJpHKjuRmjgl4x3xLBsPEFK0aZNSaB9ck1oKXvw/h6N6tt49uk+K3/DsQxpSrVna8RctiJdY8hxuXMO+j/CB6k19gT/jyUqDIxp8UYMpfsCShko8l3ezkgwKBgQCs2KAqBblxPSwRS67SEcPiFyGUglChCR1Bxp+4mMH3xO5bX6T8gknIGMLW3+3XLrtrPZFNApdV91VDQi8IIMsNx7uOluVwQHdi08nAADBWuBVN/0cwOqmcEXI7+6oC97WRUUCOnr5Q5LlS/c3yNGjWtb0gP8XqUg/otZmZq0vEFQKBgGEngGH1UPz1N6ILJjQfrozPOHp+yl7/9pHYMl8sdftI8X6q72acL6VmkyzHEVugRl+WOlwS83UNhSDZkyLG1JWhonpywMXO2pTkMEkMqFqQoppl1oiqJ+Ne5zSG2fhU6/OEqPPaVxkEPekjksZ9nrDKNCR+tgdkCA/X5Q9mZD3FAoGAP80Kedh5FhqNbKjyE+qo0ojVRVtA5eBWY1Qs2tfQKWQQ07ufS/HPyEOTj/tCcL54QeKNAs8lC39rgpMohyiLqz+BtOVwNZomN12TyAKJ1UjH3G2RWnUc7FXoQ8nmfIfxBn3mhX6FI5j5629yGKhN1otpD0FbDd5SrwRxeS6one0CgYEAjzWrVL0Ps4XiuyDjMEqk837qxr/SbmAIaBBX9ei9hGFPus8vJMAQ93Vu6TAA35JWNMrjMgezrQbizogPjDdqFP3Sae144AVseZL84787OawGNu/7vLkqCV77azPXD3tdNls1heIIPdFZv2KstRJLa08Hgs6LqazKUXoMT0q0nZo=";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://www.cardcol.com/alipaynotify.asp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://www.cardcol.com/alipayreturnurl.asp";
	// 请求网关地址
	public static String URL = "https://openapi.alipay.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqrDCGBjZEjy60kdBCcFIQqbqKXYtQjzKD31Ch1ia4rcTqbu0kgOH2ZVVGEKIGvKk7nfGnYoSbis90lisE9wZX57KVnWLJfzO3MgjHTPruqqjTEERiFCyaU/YhHQYhu1SPZSGJ+XJsX2cE+AeLLBvG2u3n9+q2kbVmxFRwbwfwUaKXvqWV8Vjr/Cu0lzhHHmQH+NKILenmUSKx2Rn2wrhxQRHnI6o5O7Y0zi9OsSVnfGpv2OVD/+PdPDjbJzEqJa5HEG9X1HAN3F7XR7LDAvPw0sR8/F6DTrVMsiSTdYce3OdXbEnBQAb8rPnMi2Cmj7iiWF7Ti842skxudpaBsQKvwIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
