/**
 * Copyright (c) 2010 Engine Yard, Inc.
 * This source code is available under the MIT license.
 * See the file LICENSE.txt for details.
 */

import java.io.IOException;
import org.jruby.Ruby;
import org.jruby.runtime.load.BasicLibraryService;

public class WarblerJarService implements BasicLibraryService {
    public boolean basicLoad(final Ruby runtime) throws IOException {
        WarblerJar.create(runtime);
        return true;
    }
}

