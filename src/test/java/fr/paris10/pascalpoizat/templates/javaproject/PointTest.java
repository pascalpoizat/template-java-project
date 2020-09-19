package fr.paris10.pascalpoizat.templates.javaproject;

import static org.testng.Assert.*;

import fr.parisnanterre.pascalpoizat.templates.javaproject.Point;

/**
 * template-java-project
 * Copyright 2015 pascalpoizat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class PointTest {

    @org.testng.annotations.Test
    public void testGetX() throws Exception {
        Point p = new Point(3, 4);
        assertEquals(p.getX(), 3);
    }

    @org.testng.annotations.Test
    public void testSetX() throws Exception {
        Point p = new Point(3, 4);
        p.setX(5);
        assertEquals(p.getX(), 5);
    }

    @org.testng.annotations.Test
    public void testGetY() throws Exception {
        Point p = new Point(3, 4);
        assertEquals(p.getY(), 4);
    }

    @org.testng.annotations.Test
    public void testSetY() throws Exception {
        Point p = new Point(3, 4);
        p.setY(6);
        assertEquals(p.getY(), 6);
    }

    @org.testng.annotations.Test
    public void testToString() throws Exception {
        Point p = new Point(3, 4);
        assertEquals(p.toString(), "(3, 4)");
    }
}