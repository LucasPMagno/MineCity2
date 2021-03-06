package br.com.gamemods.minecity;

import br.com.gamemods.minecity.api.permission.SimpleFlagHolder;

import java.util.Locale;

public final class MineCityConfig implements Cloneable
{
    public String dbUrl = "jdbc:mysql://localhost/minecity?autoReconnect=true";
    public String dbUser;
    public byte[] dbPass;
    public Locale locale;
    public SimpleFlagHolder defaultNatureFlags = new SimpleFlagHolder();
    public SimpleFlagHolder defaultCityFlags = new SimpleFlagHolder();
    public SimpleFlagHolder defaultPlotFlags = new SimpleFlagHolder();
    public SimpleFlagHolder defaultReserveFlags = new SimpleFlagHolder();
    public boolean defaultNatureDisableCities;
    public boolean useTitle = true;

    @Override
    public MineCityConfig clone()
    {
        try
        {
            MineCityConfig clone = (MineCityConfig) super.clone();
            clone.dbPass = dbPass.clone();
            return clone;
        }
        catch(CloneNotSupportedException e)
        {
            throw new UnsupportedOperationException(e);
        }
    }
}
