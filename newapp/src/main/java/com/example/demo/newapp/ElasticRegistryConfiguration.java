/*
package com.example.demo.newapp;

import io.micrometer.elastic.ElasticConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.export.elastic.ElasticProperties;
import org.springframework.boot.actuate.autoconfigure.metrics.export.properties.StepRegistryPropertiesConfigAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticRegistryConfiguration {

    @Autowired
    private ElasticProperties elasticProperties;

    @Bean
    public ElasticConfig elasticConfig() {
        return new MyElasticConfig(elasticProperties);
    }

    public class MyElasticConfig extends StepRegistryPropertiesConfigAdapter<ElasticProperties> implements ElasticConfig {

        public MyElasticConfig(ElasticProperties properties) {
            super(properties);
        }

        @Override
        public String[] hosts() {
            String host = this.host();
            return new String[] { host };
        }

        public String host() {
            return elasticProperties.getHost();
        }

        @Override
        public String index() {
            return get(ElasticProperties::getIndex, ElasticConfig.super::index);
        }

        @Override
        public String indexDateFormat() {
            return get(ElasticProperties::getIndexDateFormat,
                    ElasticConfig.super::indexDateFormat);
        }

        @Override
        public String timestampFieldName() {
            return get(ElasticProperties::getTimestampFieldName,
                    ElasticConfig.super::timestampFieldName);
        }

        @Override
        public boolean autoCreateIndex() {
            return get(ElasticProperties::isAutoCreateIndex,
                    ElasticConfig.super::autoCreateIndex);
        }

        @Override
        public String userName() {
            return get(ElasticProperties::getUserName, ElasticConfig.super::userName);
        }

        @Override
        public String password() {
            return get(ElasticProperties::getPassword, ElasticConfig.super::password);
        }

    }
}
*/
