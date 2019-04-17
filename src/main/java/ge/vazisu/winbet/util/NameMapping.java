package ge.vazisu.winbet.util;

import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

/**
 * NameMapping.
 *
 * @author Pavel_Datunashvili
 */
@UtilityClass
public class NameMapping {
    private Map<String, String> map = new HashMap<>();

    static {

        map.put("Лугано", "Lugano");
        map.put("Сьон", "Sion");
        map.put("Брондбю", "Brondby");
        map.put("Копенгаген ФК", "FC Copenhagen");


        //Portugal
        map.put("Риу-Аве", "Rio Ave");
        map.put("Витория Гимарайнш", "Guimaraes");
        map.put("Бенфика", "Benfica");
        map.put("Порту", "Porto");
        map.put("Спортинг Лиссабон", "Sp Lisbon");
        map.put("Брага", "Sp Braga");
        map.put("Морейренше", "Moreirense");
        map.put("Белененсеш", "Belenenses");
        map.put("Санта Клара", "Santa Clara");
        map.put("Маритиму", "Maritimo");
        map.put("Портимоненше", "Portimonense");
        map.put("Боавишта", "Boavista");
        map.put("Сетубал", "Setubal");
        map.put("Авеш", "Aves");
        map.put("Тондела", "Tondela");
        map.put("Насьональ", "Nacional");
        map.put("Шавиш", "Chaves");
        map.put("Фейренсе", "Feirense");

        //France
        map.put("Лилль", "Lille");
        map.put("Лион", "Lyon");
        map.put("Сент-Этьен", "St Etienne");
        map.put("Марсель", "Marseille");
        map.put("Монпелье", "Montpellier");
        map.put("Реймс", "Reims");
        map.put("Ницца", "Nice");
        map.put("Страсбур", "Strasbourg");
        map.put("Ренн", "Rennes");
        map.put("Ним", "Nimes");
        map.put("Анжер", "Angers");
        map.put("Бордо", "Bordeaux");
        map.put("Тулуза", "Toulouse");
        map.put("Нант", "Nantes");
        map.put("Монако", "Monaco");
        map.put("Амьен", "Amiens");
        map.put("Дижон", "Dijon");
        map.put("Генгам", "Guingamp");
        map.put("Кан", "Caen");
        map.put("ПСЖ", "Paris SG");

        map.put("Метц", "Metz");
        map.put("Брест", "Brest");
        map.put("Труа", "Troyes");
        map.put("Париж", "Paris FC");
        map.put("Лорьян", "Lorient");
        map.put("Ланс", "Lens");
        map.put("Орлеан", "Orleans");
        map.put("Гавр", "Le Havre");
        map.put("Гренобль", "Grenoble");
        map.put("Клермон", "Clermont");
        map.put("Ньор", "Niort");
        map.put("Валансьен", "Valenciennes");
        map.put("Газелек Аяччо", "Ajaccio GFCO");
        map.put("Аяччо", "Ajaccio");
        map.put("Осер", "Auxerre");
        map.put("Шатору", "Chateauroux");
        map.put("Сошо", "Sochaux");
        map.put("Нанси", "Nancy");
        map.put("Безье", "Beziers");
        map.put("Ред Стар", "Red Star");

        //Italy
        map.put("Ювентус", "Juventus");
        map.put("Наполи", "Napoli");
        map.put("Интер Милан", "Inter");
        map.put("Милан", "Milan");
        map.put("Рома", "Roma");
        map.put("Аталанта", "Atalanta");
        map.put("Торино", "Torino");
        map.put("Лацио", "Lazio");
        map.put("Фиорентина", "Fiorentina");
        map.put("Сассуоло", "Sassuolo");
        map.put("СПАЛ Феррара", "Spal");
        map.put("Кальяри", "Cagliari");
        map.put("Парма", "Parma");
        map.put("Удинезе", "Udinese");
        map.put("Болонья", "Bologna");
        map.put("Эмполи", "Empoli");
        map.put("Фрозиноне", "Frosinone");
        map.put("Кьево", "Chievo");
        map.put("Сампдория", "Sampdoria");
        map.put("Дженоа", "Genoa");


        map.put("Брешиа", "Brescia");
        map.put("Лечче", "Lecce");
        map.put("Палермо", "Palermo");
        map.put("Беневенто", "Benevento");
        map.put("Пескара", "Pescara");
        map.put("Верона", "Verona");
        map.put("Специя", "Spezia");
        map.put("Читтаделла", "Cittadella");
        map.put("Перуджа", "Perugia");
        map.put("Асколи", "Ascoli");
        map.put("Кремонезе", "Cremonese");
        map.put("Козенца", "Cosenza");
        map.put("Салернитана", "Salernitana");
        map.put("Кротоне", "Crotone");
        map.put("Венеция", "Venezia");
        map.put("Фоджа", "Foggia");
        map.put("Ливорно", "Livorno");
        map.put("Карпи", "Carpi");
        map.put("Падова", "Padova");

        //Norway
        map.put("Ранхейм", "Ranheim");
        map.put("Хогесунд", "Haugesund");
        map.put("Боде/Глимт", "Bodo/Glimt");
        map.put("Мольде", "Molde");
        map.put("Викинг", "Viking");
        map.put("Одд-Гренланд", "Odd");
        map.put("Сарпсборг 08", "Sarpsborg 08");
        map.put("Волеренга", "Valerenga");
        map.put("Стремсгодсет", "Stromsgodset");
        map.put("Лиллестрем", "Lillestrom");
        map.put("Бранн", "Brann");
        map.put("Стабек", "Stabaek");
        map.put("Мьондален", "Mjondalen");
        map.put("Кристиансунд БК", "Kristiansund");
        map.put("Тромсе", "Tromso");
        map.put("Русенборг", "Rosenborg");

        //Spain
        map.put("Барселона", "Barcelona");
        map.put("Атлетико Мадрид", "Ath Madrid");
        map.put("Реал Мадрид", "Real Madrid");
        map.put("Севилья", "Sevilla");
        map.put("Хетафе", "Getafe");
        map.put("Валенсия", "Valencia");
        map.put("Атлетик Бильбао", "Ath Bilbao");
        map.put("Алавес", "Alaves");
        map.put("Бетис", "Betis");
        map.put("Реал Сосьедад", "Sociedad");
        map.put("Леганес", "Leganes");
        map.put("Эспаньол", "Espanol");
        map.put("Эйбар", "Eibar");
        map.put("Жирона", "Girona");
        map.put("Вильярреал", "Villarreal");
        map.put("Леванте", "Levante");
        map.put("Сельта", "Celta");
        map.put("Вальядолид", "Valladolid");
        map.put("Райо Вальекано", "Vallecano");
        map.put("Уэска", "Huesca");

        map.put("Осасуна", "Osasuna");
        map.put("Альбасете", "Albacete");
        map.put("Гранада", "Granada");
        map.put("Кадис", "Cadiz");
        map.put("Мальорка", "Mallorca");
        map.put("Малага", "Malaga");
        map.put("Депортиво Ла-Корунья", "La Coruna");
        map.put("Спортинг Хихон", "Sp Gijon");
        map.put("Овьедо", "Oviedo");
        map.put("Альмерия", "Almeria");
        map.put("Алькоркон", "Alcorcon");
        map.put("Эльче", "Elche");
        map.put("Лас-Пальмас", "Las Palmas");
        map.put("Тенерифе", "Tenerife");
        map.put("Райо Махадахонда", "Rayo Majadahonda");
        map.put("Сарагоса", "Zaragoza");
        map.put("Эстремадура", "Extremadura UD");
        map.put("Таррагона", "Gimnastic");
        map.put("Реус", "Reus Deportiu");
        map.put("Кордова", "Cordoba");
        map.put("Луго", "Lugo");
        map.put("Нумансия", "Numancia");

        //England
        map.put("Ньюкасл Юн", "Newcastle");
        map.put("Кристал Пэлас", "Crystal Palace");
        map.put("Ливерпуль", "Liverpool");
        map.put("Манчестер С", "Man City");
        map.put("Тоттенхэм", "Tottenham");
        map.put("Арсенал", "Arsenal");
        map.put("Челси", "Chelsea");
        map.put("Манчестер Юн", "Man United");
        map.put("Лестер С", "Leicester");
        map.put("Вулверхэмптон", "Wolves");
        map.put("Эвертон", "Everton");
        map.put("Уотфорд", "Watford");
        map.put("Вест Хэм Юн", "West Ham");
        map.put("Борнмут", "Bournemouth");
        map.put("Бернли", "Burnley");
        map.put("Саутгемптон", "Southampton");
        map.put("Брайтон", "Brighton");
        map.put("Кардифф С", "Cardiff");
        map.put("Фулхэм", "Fulham");
        map.put("Хаддерсфилд Т", "Huddersfield");

        map.put("Милуолл", "Millwall");
        map.put("Престон Норт Энд", "Preston");
        map.put("Норвич С", "Norwich");
        map.put("Лидс Юн", "Leeds");
        map.put("Шеффилд Юн", "Sheffield United");
        map.put("Астон Вилла", "Aston Villa");
        map.put("Бристоль С", "Bristol City");
        map.put("Мидлсбро", "Middlesbrough");
        map.put("Дерби Каунти", "Derby");
        map.put("Халл С", "Hull");
        map.put("Шеффилд Уэнсдей", "Sheffield Weds");
        map.put("Ноттингем Форест", "Nott'm Forest");
        map.put("Суонси", "Swansea");
        map.put("Брентфорд", "Brentford");
        map.put("Блэкберн Роверс", "Blackburn");
        map.put("Сток С", "Stoke");
        map.put("КПР", "QPR");
        map.put("Бирмингем C", "Birmingham");
        map.put("Рединг", "Reading");
        map.put("Уиган", "Wigan");
        map.put("Ротерхем Юн", "Rotherham");
        map.put("Болтон Уондерерс", "Bolton");
        map.put("Ипсвич Т", "Ipswich");
        map.put("Вест Бромвич", "West Brom");

        //Russia
        map.put("Ростов", "FK Rostov");
        map.put("Спартак М", "Spartak Moscow");
        map.put("Зенит С-Петербург", "Zenit Petersburg");
        map.put("Локомотив М", "Lokomotiv Moscow");
        map.put("Краснодар", "Krasnodar");
        map.put("ЦСКА", "CSKA Moscow");
        map.put("Оренбург", "Orenburg");
        map.put("Арсенал Тула", "Arsenal Tula");
        map.put("Рубин Казань", "Rubin Kazan");
        map.put("Уфа", "Ufa");
        map.put("Крылья Советов", "FK Krylya Sovetov Samara");
        map.put("Урал", "Ural");
        map.put("Ахмат", "Akhmat Grozny");
        map.put("Динамо М", "Dynamo Moscow");
        map.put("Анжи", "FK Anzi Makhackala");
        map.put("Енисей Красноярск", "Yenisey");

        //Sweden
        map.put("Юргорден", "Djurgarden");
        map.put("Хаккен", "Hacken");
        map.put("Хельсингборг", "Helsingborg");
        map.put("Сириус", "Sirius");
        map.put("АИК Стокгольм", "AIK");
//        map.put("Весбю", "AFC Eskilstuna");
        map.put("Сундсваль", "Sundsvall");
        map.put("Мальме", "Malmo FF");
        map.put("Эльфсборг", "Elfsborg");
        map.put("Эстерсунд ФК", "Ostersunds");
        map.put("Гетеборг", "Goteborg");
        map.put("Хаммарбю", "Hammarby");
        map.put("Фалкенберг", "Falkenbergs");
        map.put("Кальмар", "Kalmar");
        map.put("Норрчепинг", "Norrkoping");
        map.put("Эребру", "Orebro");


        //Turkey
        map.put("Истанбул Башакшехир", "Buyuksehyr");
        map.put("Галатасарай", "Galatasaray");
        map.put("Бешикташ", "Besiktas");
        map.put("Трабзонспор", "Trabzonspor");
        map.put("Ени Малатьяспор", "Yeni Malatyaspor");
        map.put("Аланьяспор", "Alanyaspor");
        map.put("Антальяспор", "Antalyaspor");
        map.put("Ризеспор", "Rizespor");
        map.put("Касымпаша", "Kasimpasa");
        map.put("Коньяспор", "Konyaspor");
        map.put("Кайсериспор", "Kayserispor");
        map.put("Сивасспор", "Sivasspor");
        map.put("Анкарагюджю", "Ankaragucu");
        map.put("Фенербахче", "Fenerbahce");
        map.put("Бурсаспор", "Bursaspor");
        map.put("Гезтепе", "Goztep");
        map.put("Эрзурумспор", "Erzurum BB");
        map.put("Акхисар", "Akhisar Belediyespor");

        //Romania
        map.put("ЧФР Клуж", "CFR Cluj");
        map.put("Стяуа Бухарест", "FC Steaua Bucuresti");
        map.put("Университатя Крайова КСУ", "U Craiova 1948 CS");
        map.put("Астра Джурджу", "Astra");
        map.put("Виторул Констанца", "Viitorul Constanta");
        map.put("Шепши Сфынту Георге", "Sepsi");
        map.put("Ботошани", "FC Botosani");
        map.put("Политехника Яссы", "Poli Iasi");
        map.put("Динамо Бухарест", "Din. Bucuresti");
        map.put("Германштадт", "FC Hermannstadt");
        map.put("Газ Метан Медиас", "Gaz Metan Medias");
        map.put("Дунаря Калараши", "Calarasi");
        map.put("Волунтари", "Voluntari");
        map.put("Конкордия Кьяжна", "Concordia");


        //Germany
        map.put("Бавария", "Bayern Munich");
        map.put("Боруссия Дортмунд", "Dortmund");
        map.put("Лейпциг", "RB Leipzig");
        map.put("Айнтрахт Франкфурт", "Ein Frankfurt");
        map.put("Боруссия Менхенгладбах", "M'gladbach");
        map.put("Хоффенхайм", "Hoffenheim");
        map.put("Вердер", "Werder Bremen");
        map.put("Байер Леверкузен", "Leverkusen");
        map.put("Вольфсбург", "Wolfsburg");
        map.put("Фортуна Дюссельдорф", "Fortuna Dusseldorf");
        map.put("Герта", "Hertha");
        map.put("Аугсбург", "Augsburg");
        map.put("Фрайбург", "Freiburg");
        map.put("Майнц", "Mainz");
        map.put("Нюрнберг", "Nurnberg");
        map.put("Шальке-04", "Schalke 04");
        map.put("Штутгарт", "Stuttgart");
        map.put("Ганновер 96", "Hannover");


        map.put("Кельн", "FC Koln");
        map.put("Гамбург", "Hamburg");
        map.put("Унион Берлин", "Union Berlin");
        map.put("Падерборн", "Paderborn");
        map.put("Хольштайн Киль", "Holstein Kiel");
        map.put("Хайденхайм", "Heidenheim");
        map.put("Ст. Паули", "St Pauli");
        map.put("Арминия Билефельд", "Bielefeld");
        map.put("Регенсбург", "Regensburg");
        map.put("Бохум", "Bochum");
        map.put("Гройтер Фюрт", "Greuther Furth");
        map.put("Дармштадт", "Darmstadt");
        map.put("Динамо Дрезден", "Dresden");
        map.put("Эрцгебирге Ауэ", "Erzgebirge Aue");
        map.put("Зандхаузен", "Sandhausen");
        map.put("Магдебург", "Magdeburg");
        map.put("Ингольштадт", "Ingolstadt");
        map.put("Дуйсбург", "Duisburg");











    }

    public Map<String, String> getNameMapping() {
        return map;
    }
}
