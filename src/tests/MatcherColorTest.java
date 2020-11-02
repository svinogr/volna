package tests;

import com.volna.main.Color;
import com.volna.main.Index;
import com.volna.main.Pole;
import com.volna.main.Tile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatcherColorTest {
    private final Index end = new Index(9, 9);
    private Index start = new Index(0, 0);

    private List<List<Tile>> arrayList = new ArrayList<>();
    private Pole pole;


    @Before
    public void setUp() throws Exception {
        pole = new Pole(10,10);
       Tile[][] tiles = {
                {
                        new Tile(Color.BlACK,new Index(0,0)), new Tile(Color.BlACK,new Index(0,0)),
                        new Tile(Color.RED,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                        new Tile(Color.BlACK,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                        new Tile(Color.BlACK,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                        new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0))
                },
                        new Tile[]{
                                new Tile(Color.RED,new Index(0,0)), new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.BlACK,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0))
                        },
                        new Tile[]{
                                new Tile(Color.GREEN,new Index(0,0)), new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.BlACK,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0))
                        },
                        new Tile[]{new Tile(Color.GREEN,new Index(0,0)), new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0))},
                        new Tile[]{
                                new Tile(Color.RED,new Index(0,0)), new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0))
                        },
                        new Tile[]{

                                new Tile(Color.RED,new Index(0,0)), new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0))},
                        new Tile[]{
                                new Tile(Color.BlACK,new Index(0,0)), new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0))},
                        new Tile[]{
                                new Tile(Color.BlACK,new Index(0,0)), new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0))},
                        new Tile[]{
                                new Tile(Color.BlACK,new Index(0,0)), new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.RED,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.RED,new Index(0,0))
                        },
                        new Tile[]{
                                new Tile(Color.RED,new Index(0,0)), new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.BlACK,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0)),
                                new Tile(Color.BlACK,new Index(0,0)),new Tile(Color.RED,new Index(0,0)),
                                new Tile(Color.GREEN,new Index(0,0)),new Tile(Color.GREEN,new Index(0,0))
                        }
        };


       pole.setPole(tiles);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void match() {

    }
}