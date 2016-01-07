import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * template-java-project
 * Copyright (C) 2016 pascalpoizat (@pascalpoizat)
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class PrincipalTest {

    @Test
    public void testMain() throws Exception {
        String args[] = {};
        Principal.main(args);
    }
}