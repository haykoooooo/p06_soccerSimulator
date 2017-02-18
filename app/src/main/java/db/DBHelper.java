package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Shopping", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table matches (id integer primary key autoincrement, team1 text not null," +
                " team2 text not null, date text not null, " +
                "details text not null, result text not null, goals1 integer not null, goals2 integer not null);");
        db.execSQL("create table teams (id integer primary key autoincrement, name text not null, " +
                "country text not null, strength integer not null, games integer default 0 not null, " +
                "win integer default 0 not null, draw integer default 0 not null, lost integer " +
                "default 0 not null, goals_for integer default 0 not null, goals_against integer default 0 not null);");
        db.execSQL("insert into teams (name, country, strength) " +
                "values ('Real Madrid','Spain',825),('Barcelona','Spain',825),('Atletico Madrid','Spain',750)," +
                "('Villareal','Spain', 675),('Sevilla','Spain',700),('Celta','Spain',650),('Malaga','Spain',600)," +
                "('Athletic Bilbao','Spain',650),('Eibar','Spain',575),('Valencia','Spain',625)," +
                "('Deportivo La Coruna','Spain',575),('Alaves','Spain',550),('Osasuna','Spain',525),('Granada','Spain',525)," +
                "('Real Sociedad','Spain',650),('Espanol','Spain',575),('Las Palmas','Spain',600)," +
                "('Betis','Spain',575),('Leganes','Spain',525),('Sporting Gijon','Spain',550)," +
                "('Levante','Spain',525),('Girona','Spain',525),('Cadiz','Spain',500),('Getafe','Spain',475)," +
                "('Tenerife','Spain',475),('Real Oviedo','Spain',475),('Numancia','Spain',450),('Valladolid','Spain',450)," +
                "('Elche','Spain',450),('Zaragoza','Spain',425),('Rayo Vallecano','Spain',425)," +
                "('Mallorca','Spain',425),('Cordoba','Spain',400),('Almeria','Spain',400)," +
                "('Gimnastic','Spain',375),('Racing Santander','Spain',375),('Albacete','Spain',375),('Hercules','Spain',350)," +
                "('Real Murcia','Spain',350),('Recreativo','Spain',325),('Merida','Spain',350)," +
                "('Lazio','Italy',650),('Milan','Italy',650),('Fiorentina','Italy',650),('Torino','Italy',625)," +
                "('Sampdoria','Italy',625),('Chievo','Italy',600),('Udinese','Italy',600),('Sassuolo','Italy',575)," +
                "('Bologna','Italy',550),('Juventus','Italy',775),('Roma','Italy',700),('Napoli','Italy',700)," +
                "('Inter','Italy',675),('Atalanta','Italy',600),('Cagliari','Italy',550),('Genoa','Italy',550)," +
                "('Empoli','Italy',525),('Palermo','Italy',500),('Crotone','Italy',500),('Pescara','Italy',500)," +
                "('Frosinone','Italy',500),('Verona','Italy',500),('Spal','Italy',475),('Benevento','Italy',475)," +
                "('Spezia','Italy',475),('Perugia','Italy',475),('Citadella','Italy',475),('Entella','Italy',475)," +
                "('Bari','Italy',450),('Ascoli','Italy',450),('Carpi','Italy',450),('Novara','Italy',425)," +
                "('Salernitana','Italy',425),('Cesena','Italy',425),('Brescia','Italy',400),('Vicenza','Italy',400)," +
                "('Livorno','Italy',375),('Como','Italy',350),('Piacenza','Italy',350),('Siena','Italy',325)," +
                "('Venezia','Italy',400),('Padova','Italy',400),('Parma','Italy',400),('Reggiana','Italy',400)," +
                "('Ancona','Italy',325),('Modena','Italy',325),('Foggia','Italy',400),('Lecce','Italy',400)," +
                "('Catania','Italy',375),('Messina','Italy',325),('Reggina','Italy',325),('Albinolefe','Italy',350)," +
                "('Arsenal','England',750),('Chelsea','England',800),('Manchester United','England',775)," +
                "('Liverpool','England',725),('Manchester City','England',750),('Tottenham','England',700)," +
                "('West Ham','England',625),('Middlesbrough','England',600),('Everton','England',675)," +
                "('West Bromwich','England',600),('Stoke City','England',600),('Leiceter City','England',650)," +
                "('Southampton','England',625),('Burnley','England',575),('Watford','England',550)," +
                "('Bournemouth','England',550),('Swansea','England',550),('Hull City','England',525)," +
                "('Crystal Palace','England',525),('Sunderland','England',525),('Huddersfield','England',500)," +
                "('Reading','England',500),('Leeds United','England',500),('Sheffield Wednesday','England',500)," +
                "('Norwich','England',500),('Fulham','England',500),('Derby County','England',500)," +
                "('Newcastle United','England',525),('Brighton','England',525),('Barnsley','England',500)," +
                "('Cardiff','England',475),('Ipswich Town','England',475),('Birmingham','England',475)," +
                "('Aston Villa','England',450),('Nottingham Forest','England',450),('Wolverhampton','England',450)," +
                "('Queens Park Rangers','England',450),('Wigan','England',425),('Blackburn','England',425)," +
                "('Sheffield United','England',425),('Bolton','England',400),('Charlton','England',350)," +
                "('Wimbledon','England',350),('Coventry','England',325),('Portsmouth','England',375),('Blackpool','England',350)," +
                "('Bayern Munich','Germany',800),('Borussia Dortmund','Germany',750),('Bayer Leverkusen','Germany',675)," +
                "('Schalke-04','Germany',650),('Leipzig','Germany',625),('Wolfsburg','Germany',625),('Hamburg','Germany',600)," +
                "('Werder Bremen','Germany',575),('Eintracht Frankfurt','Germany',600),('Koln','Germany',625)," +
                "('Hertha Berlin','Germany',625),('Hoffenheim','Germany',600),('Freiburg','Germany',550)," +
                "('Borussia Moenchengladbach','Germany',600),('Mainz','Germany',550),('Augsburg','Germany',550)," +
                "('Ingolstadt','Germany',525),('Darmstadt','Germany',525),('Stutgart','Germany',525),('Hannover','Germany',500)," +
                "('Nurnberg','Germany',475),('Fortuna Dusseldorf','Germany',450),('Eintracht Braunschweig','Germany',500)," +
                "('Greuter Furth','Germany',450),('Kaiserslautern','Germany',450),('Bochum','Germany',450)," +
                "('Munchen 1860','Germany',450),('Karlsruher','Germany',425),('St. Pauli','Germany',425)," +
                "('Arminia','Germany',425),('Duisburg','Germany',425),('Hansa','Germany',375),('Paderborn','Germany',375)" +
                "('Paris Saint Germain','France',775),('Monaco','France',725),('Lyon','France',700),('Nice','France',625)," +
                "('Saint Etienne','France',600),('Marseille','France',625),('Bordeaux','France',600)," +
                "('Guingamp','France',575),('Toulouse','France',550),('Rennes','France',575),('Montpellier','France',575)," +
                "('Nantes','France',550),('Dijon','France',525),('Nancy','France',525),('Angers','France',525)," +
                "('Metz','France',525),('Lilles','France',550),('Caen','France',500),('Bastia','France',500)," +
                "('Lorient','France',500),('Brest','France',500),('Amiens','France',475),('Lens','France',475)," +
                "('Troyes','France',475),('Strasbourg','France',450),('Socheaux','France',425)," +
                "('Ajaccio','France',425),('Gazelec Ajaccio','France',425),('Valencienes','France',425)," +
                "('Auxerre','France',400),('Sedan','France',300),('Le Havre','France',425)," +
                "('Feyenoord','Netherlands',650),('Ajax','Netherlands',675),('AZ Alkmaar','Netherlands',600)," +
                "('Twente','Netherlands',550),('Utrecht','Netherlands',525),('Heerenveen','Netherlands',550)," +
                "('Vitesse','Netherlands',525),('Groningen','Netherlands',525),('Heracles','Netherlands',500)," +
                "('Willem','Netherlands',500),('NEC Nijmegen','Netherlands',500),('Zwolle','Netherlands',475)," +
                "('Excelsior','Netherlands',450),('Go Ahead Eagles','Netherlands',450),('Sparta','Netherlands',450)," +
                "('Roda','Netherlands',475),('Den Haag','Netherlands',450),('PSV Eindhoven','Netherlands',700),"+
                "('Anderlecht','Belgium',650),('Brugge','Belgium',625),('Genk','Belgium',600),('Gent','Belgium',575)," +
                "('Zulte Waaregem','Belgium',525),('Oostende','Belgium',525),('Charleroi','Belgium',550)," +
                "('Mechelen','Belgium',525),('Standard','Belgium',575),('Kortrijk','Belgium',500)," +
                "('Lokeren','Belgium',525),('St. Truiden','Belgium',475),('Eupen','Belgium',475)," +
                "('Waasland Beveren','Belgium',450),('Westerlo','Belgium',450),('Mouscron','Belgium',425),"+
                "('Porto','Portugal',725),('Benfica','Portugal',700),('Sporting','Portugal',650),('Braga','Portugal',600)," +
                "('Guimaraes','Portugal',575),('Maritimo','Portugal',550),('Rio Ave','Portugal',525),('Setubal','Portugal',500)," +
                "('Boavista','Portugal',500),('Estoril','Portugal',525),('Arouca','Portugal',475),('Belenenses','Portugal',475)," +
                "('Chaves','Portugal',500),('Feirense','Portugal',475),('Pasos De Fereira','Portugal',450)," +
                "('Moreirense','Portugal',450),('Nacional','Portugal',450),('Tondela','Portugal',425)," +
                "('Spartak Moscow','Russia',650),('Lokomotiv Moscow','Russia',600),('CSKA Moscow','Russia',675)," +
                "('Zenit','Russia',700),('Krasnodar','Russia',600),('Rostov','Russia',625),('Terek','Russia',575)," +
                "('Amkar','Russia',550),('Ufa','Russia',525),('Rubin','Russia',550),('Anzhi','Russia',500)," +
                "('Krilya Sovetov','Russia',475),('Ural','Russia',475),('Orenburg','Russia',450)," +
                "('Arsenal','Russia',450),('Tom','Russia',425),('Dinamo Moscow','Russia',450)," +
                "('Olympiacos','Greece',675),('Panathinaikos','Greece',600),('AEK','Greece',600)," +
                "('PAOK','Greece',575),('Asteras','Greece',550),('Panionios','Greece',525)" +
                "('Besiktas','Turkey',675),('Basaksehir','Turkey',600),('Galatasaray','Turkey',625),('Trabzonspor','Turkey',575)," +
                "('Osmanlispor','Turkey',500),('Fenerbahce','Turkey',650),('Genclerbirligi','Turkey',475)," +
                "('Legia Warsaw','Poland',625),('Wysla Krakow','Poland',600),('Lech Poznan','Poland',575)," +
                "('Maccabi Tel-Aviv','Israel',550),('Maccabi Haifa','Israel',500),('Hapoel Tel-Aviv','Israel',525)," +
                "('Hapoel Beer-Sheva','Israel',500),('APOEL','Cyprus',500),('Anorthosis','Cyprus',475)," +
                "('AEK Larnaka','Cyprus',450),('Kobenhavn','Denmark',575),('Brondby','Denmark',575),('Midtyland','Denmark',575)," +
                "('Nordsjaelland','Denmark',500),('Odense','Denmark',450),('Alborg','Denmark',475)," +
                "('Goteborg','Sweden',450),('Malmo','Sweden',500),('AIK','Sweden',475),('Norkkoping','Sweden',450)," +
                "('Elfsborg','Sweden',425),('Odd Grenland','Norway',475),('Rosenborg','Norway',500),('Brann','Norway',450)," +
                "('Haugesund','Norway',450),('Molde','Norway',425),('Stromsgodset','Norway',400),('Stabaek','Norway',400)," +
                "('Red Bull Salzburg','Austria',525),('Rapid Vienna','Austria',475),('Sturm Graz','Austria',450)," +
                "('Basel','Switzerland',550),('Young Boys','Switzerland',500),('Grasshoppers','Switzerland',475)," +
                "('Luzern','Switzerland',450),('Vaduz','Liechtenstein',375),('Sion','Switzerland',425)," +
                "('Viktoria Plzen','Czech Republic',550),('Sparta Prague','Czech Republic',525)," +
                "('Slavia Prague','Czech Republic',525),('Slovan Liberec','Czech Republic',500)," +
                "('Mlada Boleslav','Czech Republic',475),('Trencin','Slovakia',525),('Slovan Bratislava','Slovakia',475)," +
                "('Spartak Myjava','Slovakia',500),('Spartak Trnava','Slovakia',500),('Zilina','Slovakia',475)," +
                "('Dinamo Kiev','Ukraine',675),('Shakhtar Donetsk','Ukraine',675),('Zorya','Ukraine',600)," +
                "('Dinamo Zagreb','Croatia',600),('Astra','Romania',600),('Cluj','Romania',525),('Vaslui','Romania',450)," +
                "('Steaua','Romania',575),('Viitorul','Romania',500),('Pandurii','Romania',475),('Petrolul','Romania',425)," +
                "('Dinamo Bucharest','Romania',475),('Bate','Belarus',575),('Oleksandria','Ukraine',500)," +
                "('Gabala','Azerbaijan',550),('Qarabag','Azerbaijan',475),('Neftchi','Azerbaijan',500)," +
                "('Inter Baku','Azerbaijan',450),('Khazar Lenkoran','Azerbaijan',400),('Kapaz','Azerbaijan',375)," +
                "('Ludogorets','Bulgaria',550),('Beroe','Bulgaria',400),('Botev','Bulgaria',400),('Levski','Bulgaria',375)," +
                "('Litex','Bulgaria',350),('Cherno More','Bulgaria',350),('Lokomotiv Plovdid','Bulgaria',350)," +
                "('CSKA Sofia','Bulgaria',350),('Shakhter Soligorsk','Belarus',475),('Dinamo Minsk','Belarus',500)," +
                "('Rijeka','Croatia',525),('Hajduk','Croatia',500),('Lokomotiv Zagreb','Croatia',475)," +
                "('Celtic','Scotland',625),('Aberdeen','Scotland',525),('Glasgow Rangers','Scotland',500)," +
                "('Motherwell','Scotland',425),('St. Johnstone','Scotland',450),('Hearts','Scotland',475)," +
                "('Kilmarnock','Scotland',450),('Dundee','Scotland',425),('Ross County','Scotland',425)," +
                "('Partick Thistle','Scotland',425),('Hamilton','Scotland',400),('Inverness','Scotland',400)," +
                "('Astana','Kazakhstan',600),('Aktobe','Kazakhstan',575),('Shakhter Karaganda','Kazakhstan',525)," +
                "('Kairat','Kazakhstan',525),('Ordabasi','Kazakhstan',500),('Irtish','Kazakhstan',475)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',)," +
                "('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),('','',),");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}