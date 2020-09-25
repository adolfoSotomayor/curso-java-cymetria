/**
 * Demuestra un programa basico en Java
 * @author Leandro Perez Guatibonza
 *
 * Copyright 2016-2020 Leandro Perez Guatibonza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
public class Saludo
{
    /**
     * Este es el punto de entrada a la aplicacion
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Bienvenidos a la programacion en Java!");

        System.out.println("Bienvenidos\na la programacion\nen Java!");

        System.out.print("Bienvenidos\n");
        System.out.print("a la programacion\n");
        System.out.print("en Java!\n");

        System.out.printf("%s\n%s\n%s", "Bienvenidos", "a la programacion", "en Java!");
    }
}