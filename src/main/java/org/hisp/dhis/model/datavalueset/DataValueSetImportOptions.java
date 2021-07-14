package org.hisp.dhis.model.datavalueset;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.hisp.dhis.model.IdScheme;

@Getter
@Setter
@Accessors( chain = true )
public class DataValueSetImportOptions
{
    private IdScheme dataElementIdScheme;

    private IdScheme orgUnitIdScheme;

    private IdScheme categoryOptionComboIdScheme;

    private IdScheme idScheme;

    private Boolean skipAudit;

    private DataValueSetImportOptions()
    {
    }

    public static DataValueSetImportOptions instance()
    {
        return new DataValueSetImportOptions();
    }
}
