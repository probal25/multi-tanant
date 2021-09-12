package com.probal.multi_tanant.DataConfig;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {

        return "titas";
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
