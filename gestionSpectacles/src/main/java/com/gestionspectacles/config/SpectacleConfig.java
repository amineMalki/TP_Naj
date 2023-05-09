package com.gestionspectacles.config;


import com.gestionspectacles.model.Improvisation;
import com.gestionspectacles.model.Musique;
import com.gestionspectacles.model.Spectacle;
import com.gestionspectacles.model.Theatre;
import com.gestionspectacles.repository.SpectacleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpectacleConfig {

    @Bean
    CommandLineRunner clR(SpectacleRepository sRepo) {
        return args -> {

            Spectacle spec1 = new Musique(
                    250,
                    "20:00",
                    "Les Blondes Naturelles",
                    "musique",
                    "Le trio féminin Blondes Naturelles n’a pas la langue dans sa poche. Dans une ambiance acoustique où les harmonies vocales sont en vedette, ces chanteuses aguerries se livrent dans un Cabaret-folk révolutionnaire pour incarner des chansons extravagantes teintées de vérité. Avec une pointe de sensualité, elles sabotent le stéréotype de la blonde à grands coups de jokes de matantes. Grâce à leur authenticité théâtrale, leurs paroles percutantes et leur façon unique d’interpréter des classiques du répertoire québécois, chaque spectacle promet une expérience drôlement rafraîchissante. Oreilles chastes, s’abstenir.",
                    "2023-04-30",
                    59.99,"Les Blondes Naturelles",
                    "Vincent Vallières",
                    "Cabaret-Folk révolutionnaire"
            );
            Spectacle spec2 = new Theatre(
                    250,
                    "20:00",
                    "Je t'écris au milieu d'un bel orage",
                    "theatre",
                    "AMOUR EXTRÊME\t\tLe 6 juin 1944, les forces alliées débarquent en Normandie et Maria Casarès dans la vie d’Albert Camus. La comédienne en est encore à ses débuts, arrivée d’Espagne huit ans plus tôt avec ses parents fuyant la dictature. Camus, marié et père de deux enfants, impliqué dans la Résistance, est déjà au cœur des lettres françaises, avec la publication deux ans plus tôt de L’étranger et du Mythe de Sisyphe. Il vient d’engager Maria pour créer le rôle de Martha dans Le malentendu. Mais dans leur relation, c’est elle qui, avec son exigence d’une vie indépendante, mène la danse. Leur passion durera quinze ans, traversant les tumultes politiques de l’après-guerre, la frénésie intellectuelle des années chaudes de Saint-Germain-des-Prés, leurs angoisses créatrices et les aléas du quotidien. Puis, le 4 janvier 1960, Camus meurt dans un accident de voiture. Ne reste que la stupeur de la mort. Et 865 lettres d’amour. ● Ces lettres, Dany Boudreault, poète ardent et dramaturge audacieux, s’en est emparé, prenant une phrase ici, un paragraphe là, pour recréer la fulgurance et la hauteur de vue de cet amour d’exception où, par « un certain degré de chaleur mutuelle, les cœurs fondent ensemble dans quelque chose qui n’a plus de nom ». À la mise en scène, l’attentif et novateur Maxime Carbonneau, complice de longue date de Dany Boudreault, fait son entrée au TNM. La magnifique Anne Dorval interprète l’électrisante complexité de Maria Casarès alors que l’admirable auteur et comédien Steve Gagnon porte la parole d’Albert Camus.",
                    "2023-03-22",
                    79.99,
                    "Geordie Theatre",
                    "Albert Camus"

            );
            Spectacle spec3 = new Theatre(
                    250,
                    "20:00",
                    "Pas perdus | documentaires scéniques",
                    "theatre",
                    "Créé par Anaïs Barbeau‑Lavalette et Émile Proulx‑Cloutier et présenté au printemps dernier, Pas perdus, documentaires scéniques est un spectacle unique et bouleversant qui a touché le cœur du public. C’est avec enthousiasme que le TNM présente cette création sur sa scène afin de permettre à un plus large auditoire de vibrer au rythme des récits qui tracent huit portraits d’individus remarquables. Les deux artistes privilégient l’authenticité d’une parole spontanée, mise en scène dans un espace qui favorise la rencontre entre la personne qui se raconte et le public. En favorisant la pluralité des voix, les créateurs s’interrogent sur la mémoire, le patrimoine, le deuil, l’identité et la transmission. Un moment de théâtre essentiel et empreint d’humanité, qui invite à poser un regard neuf sur des choses connues.",
                    "2023-05-09",
                    79.99,
                    "DynamO Théâtre",
                    "Anaïs Barbeau‑Lavalette"
            );
            Spectacle spec4 = new Theatre(250,
                    "20:00",
                    "Le rêveur dans son bain",
                    "theatre",
                    "VIENS VOIR LES MAGICIENS !\t\tDe tous les créateurs, ceux qui nous transportent à la frontière de la magie et du rêve sont les plus séduisants : illusionnistes, inventeurs d’effets spéciaux, illustrateurs de songes. Mais en s’épuisant à faire advenir ce qui est impossible, certains en viennent à sacrifier à leur art leur raison, leurs amours et leurs enfants. Hugo Bélanger nous a époustouflés avec son triomphal Tour du monde en 80 jours. Plongeant cette fois au cœur de l’inspiration et des créateurs, il rend hommage aux maîtres du merveilleux de la fin du XIXe et du début du XXe siècle dont le magicien Jean-Eugène Robert-Houdin, le cinéaste Georges Méliès et le bédéiste Winsor McCay, ainsi qu’aux femmes artistes trop souvent oubliées telle la Baronne Elsa Von Freytag. Prodiguant la force de l’imaginaire où se croisent magie, bande dessinée, cinéma et théâtre, cette création pose également la question de l’artiste vis-à-vis de son œuvre et des répercussions de cet engagement envers l’art dans sa vie. Imaginez une immense maison sans âge, un grandiose capharnaüm qui tient à la fois du grenier aux merveilles, du cabinet de curiosités et du magasin d’accessoires d’un très vieux théâtre. Y entre subrepticement un jeune homme qui veut savoir si c’est vrai qu’habite là un ermite qui aurait arrêté le temps. Or, il s’avère bien réel, installé dans son bain depuis plus de vingt ans, au grand dam de son fils. Mais comment faire entendre raison à un rêveur allié à une ondine et capable de faire apparaître ce qu’il veut ? Autour du Rêveur incarné par Normand D’Amour, Hugo Bélanger s’est entouré de complices dont Cynthia Wu-Maheux en Ondine, Renaud Lacelle-Bourdon dans le rôle du Fils, Sébastien René en Jeune Homme et l’inénarrable Carl Béchard en Robert-Houdin.",
                    "2023-04-09",
                    79.99,
                    "L'Aubergine",
                    "Albert Brecht"
            );
            Spectacle spec5 = new Theatre(250,
                    "20:00",
                    "La descente aux affaires",
                    "theatre",
                    "Sur les années prospères de Saint-Élie-de-Caxton, Toussaint Brodeur tenait son magasin général et faisait bénéfice de tout. À l’usure, à l’ouvrage et par ses calculs étonnants, il accumula une jolie fortune sur laquelle il fit trôner sa fierté. Aussi, le jour où il se retrouva devant l’Éternité, il se rendit bien compte qu’il n’avait pas mis de temps dans son coffre-fort. Toussaint était riche, mais n'avait même pas les moyens de racheter une seule seconde de sa vie. Il était trop tard.\t Nous sommes tous égaux devant le temps. C’est notre manière de l’utiliser qui nous distingue.\t Les histoires de Fred nous amènent une fois de plus à la rencontre des personnages du Caxton légendaire et nous relancent dans les rires, la poésie et les grandes réflexions.", "2023-09-21",
                    79.99,
                    "L'Arrière Scène",
                    "Fred Pellerin "
            );
            Spectacle spec6 = new Musique(
                    250,
                    "20:00",
                    "Madama Butterfly",
                    "musique",
                    "Puccini dira un jour qu’il s’agit de l’œuvre la plus sincère et expressive qu’il n’ait jamais écrite. Au-delà de la confrontation entre deux civilisations, Madama Butterfly est une ode à l’amour, une ode à la femme. Dans cette grandiose production, ce sont deux femmes qui occuperont les rôles de cheffe d’orchestre et de metteure en scène.",
                    "2023-05-11",
                    155.5,
                    "Puccini",
                    "Kent Nagano",
                    "Classique"
            );
            Spectacle spec7 = new Musique(
                    250,
                    "20:00",
                    "It's a Kinda Magic",
                    "musique",
                    "Provenant d’Australie, Queen: It’s a Kinda Magic sera à Montréal lors de sa première tournée nationale canadienne! Le spectacle se veut immersif, tout en grandeur et à l'image de l'extravagance de Queen et Freddie Mercury, mais cette fois avec une nouvelle tête d'affiche, Dominic Warren. Vous avez vu Bohemian Rhapsody au cinéma, maintenant voyez le bien vivant sur scène, avec un son puissant, des écrans géants, des éclairages et des costumes extravagants!",
                    "2023-05-13",
                    68.5,
                    "Queen Australia",
                    "Kimbra",
                    "Rock"
            );
            Spectacle spec8 = new Musique(250,
                    "20:00",
                    "Buddy Guy",
                    "musique",
                    "À 86 ans, Buddy Guy a de nombreux prix à son actif, notamment 8 Grammy, un Lifetime Acheivement Award des Grammy et 38 Blues Music Awards (un record!), en plus d’avoir été intronisé au Rock and Roll Hall of Fame en 2005. À sa cérémonie d’intronisation, Eric Clapton a déclaré qu’il « a été pour [lui] ce qu'Elvis était probablement pour d'autres personnes ». En 2021, PBS American Masters a produit un documentaire à son sujet, Buddy Guy : The Blues Chase the Blues Away, suivant son ascension depuis son enfance dans les plantations de coton louisianaises jusqu'à devenir l'un des guitaristes les plus influents de tous les temps. ", "2023-06-30",
                    93.25,
                    "Buddy Guy",
                    "Buddy Holly",
                    "Rock"
            );
            Spectacle spec9 = new Musique(250,
                    "20:00",
                    "Portas tour",
                    "musique",
                    "Pour présenter son nouveau spectacle pour la première fois au Canada, Marisa Monte sera accompagnée sur scène par Dadi (basse, clavier et guitare), Davi Moraes (guitares), Pupillo (batterie), Pretinho da Serrinha (percussions, cavaquinho et voix), Chico Brown (clavier, guitare, basse et voix), Antonio Neves (trombone, adaptations et arrangements pour cuivres), Eduardo Santanna (trompette et bugle) et Lessa (flûte et sax).\t\tOutre les chansons du nouvel album, Portas, vous pourrez entendre les plus grands succès de la carrière de l'auteure-compositrice-interprète, s’étendant sur plus de trois décennies.",
                    "2023-07-34",
                    93.25,
                    "Marisa Monte",
                    "Pink Maritini",
                    "Jazz"
            );
            Spectacle spec10 = new Musique(250,
                    "20:00",
                    "Tsuzumi",
                    "musique",
                    "Afin de souligner son 40e anniversaire, le collectif japonais KODO, illustre groupe de percussions taiko, présente Tsuzumi, un spectacle commémoratif qui retrace les origines de la troupe depuis ses tout débuts.\t\tAu Japon, on ne saurait imaginer un festival, une cérémonie religieuse ou une danse traditionnelle sans le son du taiko. Sa réverbération, qui fait vibrer le corps et l’âme, est considérée comme le cœur du peuple nippon, et son rythme donne à chacun une véritable force de vivre. L’énergie du taiko — et de ses interprètes — est contagieuse.\t\tDans ce nouveau spectacle très physique, la pièce Duy-Ha, qui leur avait été présentée comme un cadeau à leur fondation en 1981, sera performée pour la première fois depuis 15 ans. Tsuzumi présentera également le chef-d'œuvre d'Ishii Monochrome et d'autres pièces signature de KODO telles que O-daiko, Yatai-bayashi et Zoku, ainsi que de nouvelles compositions.",
                    "2023-03-16",
                    98.25,
                    "KODO",
                    "Mari Nakatomi",
                    "Jazz"
            );

            Spectacle spec11 = new Musique(
                    250,
                    "20:00",
                    "Diana Krall",
                    "musique",
                    "Avec des enregistrements inclus dans plusieurs bandes originales de films et des collaborations avec de nombreux artistes dont Paul McCartney, Barbra Streisand et Tony Bennett, Diana Krall est l'une des artistes les plus reconnaissables de notre époque, grâce à un talent exceptionnel qui transcende tout style musical. Seule chanteuse de jazz à avoir vu huit de ses albums entrer en tête du classement Billboard jazz, elle se produit à guichet fermé à travers le monde, notamment dans les plus grands festivals de jazz et salles de concert d'Amérique du Nord, d'Europe, d'Asie et d'Australie.",
                    "2023-08-04",
                    125.5,
                    "Diana Krall",
                    "Elvis Costello",
                    "Jazz"
            );


            Spectacle spec12 = new Musique(
                    250,
                    "20:00",
                    "Madeleine Peyroux & Martha Wainwright",
                    "musique",
                    "Après avoir terminé sa tournée mondiale Careless Love, l'auteure-compositrice-interprète de jazz Madeleine Peyroux reprend la route, cette fois-ci accompagnée de l’artiste de renom Martha Wainwright.\t\tLe spectacle comprendra des interprétations des morceaux favoris du répertoire de Peyroux, notamment son album classique Careless Love, qui a été un succès en 2004. Elle présentera également de nouvelles pièces issues de ses projets à venir.",
                    "2023-05-21",
                    100.0,
                    "Madeleine Peyroux",
                    "Martha Wainwright",
                    "Jazz"
            );


            Spectacle spec13 = new Musique(
                    250,
                    "20:00",
                    "Music For",
                    "musique",
                    "Lorsqu'il s'agit de définir l'espace entre la musique classique et la musique électronique, presque aucun autre nom n'est mentionné aussi souvent que celui du pianiste, compositeur et producteur basé à Berlin, Nils Frahm. Son approche non conventionnelle d'un instrument séculaire, joué de manière contemplative et intimiste, et son alchimie sonore de textures ambiantes et d'electronica atmosphérique, lui ont valu de nombreux fans à travers le monde. Pour la première fois depuis 2019, il sera de retour sur scène dans le cadre sa tournée mondiale nommée Music For et s'arrêtera à la Salle Wilfrid Pelletier pour une performance exclusive.",
                    "2023-04-19",
                    69.0,
                    "Nils Frahm",
                    "Martha Wainwright",
                    "Classique"
            );


            Spectacle spec14 = new Musique(
                    250,
                    "20:00",
                    "Riopelle symphonique",
                    "musique",
                    "Présenté dans le cadre des célébrations du centenaire de Jean Paul Riopelle et de Montréal en lumière, le spectacle multimédia Riopelle symphonique invite le public à plonger au cœur de l’œuvre de l’artiste, au rythme d’une création musicale signée Serge Fiori et Blair Thomson, interprétée par l’Orchestre symphonique de Montréal, sous la direction d’Adam Johnson, et les Chœurs des Petits Chanteurs de Laval dirigés par Philippe Ostiguy et le chœur Temps Fort.\t\tConjuguant projections et scénographie audacieuse, le spectacle en cinq actes évoque les grandes périodes de la vie de l’artiste et de sa fructueuse carrière échelonnée sur sept décennies. Symbole de liberté et infatigable oiseau migrateur, l’emblématique oie sauvage guide le public à travers les lieux réels et imaginaires fréquentés par Riopelle, témoin privilégié de son geste créateur et de son inépuisable capacité de se réinventer. La direction artistique est signée par Nicolas Lemieux.",
                    "2024-02-19",
                    165.5,
                    "L'OSM",
                    "Kent Nagano",
                    "Classique"
            );


            Spectacle spec15 = new Musique(
                    250,
                    "20:00",
                    "Le Concerto pour piano de Gershwin",
                    "musique",
                    "Un jeu d’influences et de filiations musicales unit les œuvres de ce programme, d’un côté et de l’autre de l’Atlantique. Tant Petrouchka que Daphnis et Chloé ont été composées pour les Ballets russes de Sergueï Diaghilev, tandis que l'esthétique russe rejaillit dans le Concerto en fa de Gershwin, créé en 1925. Outre ses accents slaves, le Concerto nous plonge dans l’ambiance des années 1920 aux États-Unis, entre blues et charleston. Des étudiants en musique issus de l’enseignement supérieur se joindront aux musiciens de l’Orchestre dans Petrouchka de Stravinsky.",
                    "2023-10-19",
                    92.75,
                    "L'OSM",
                    "Kent Nagano",
                    "Classique"
            );


            Spectacle spec16 = new Musique(
                    250,
                    "20:00",
                    "Melody Gardot",
                    "musique",
                    "Melody Gardot en a fait du chemin depuis qu’elle a écrit son premier EP depuis un lit d’hôpital, victime d’un délit de fuite qui a failli lui coûter la vie. Utilisant les bienfaits thérapeutiques de la musique, elle a développé un son jazz très personnel, près de ses émotions.\t\tComparée à Joni Mitchell et Eva Cassidy à la sortie de son premier album, elle a su se réinventer au cours des années sans perdre la sensibilité qui a fait son succès. Son dernier album, Entre eux deux, co-écrit avec le pianiste compositeur Philippe Powell, redonne vie au format piano et voix, y infusant une perspective nouvelle, empreinte d’une sensualité romantique.",
                    "2023-07-02",
                    75.0,
                    "Melody Gardot",
                    "Natalie Cole",
                    "Jazz"
            );


            Spectacle spec17 = new Improvisation(
                    250,
                    "20:00",
                    "Les Verts visitent les Rouges",
                    "improvisation",
                    "Si le théâtre est une créature éphémère qui ne vit que quelques semaines, voire quelques mois, l’improvisation est une luciole dont l’existence ne dépasse pas les quelques minutes de sa création. Mais, bien que de très courte durée, la lumière qu’elle projette est intense et marquante. Création à l’état pur, l’improvisation se bâtit dans le moment présent. On ne saurait la contrôler ou lui dicter sa voix. Elle est libre, incontrôlable et indomptée. Depuis 45 ans, le Théâtre de la LNI s’attaque à l’art de l’éphémère et du spontané. C’est une preuve de sa détermination à être un modèle durable pour la culture québécoise.",
                    "2023-06-12",
                    40.0,
                    "Rouges",
                    "Verts"
            );


            Spectacle spec18 = new Improvisation(
                    250,
                    "20:00",
                    "Les Bleus visitent les Noirs",
                    "improvisation",
                    "Si le théâtre est une créature éphémère qui ne vit que quelques semaines, voire quelques mois, l’improvisation est une luciole dont l’existence ne dépasse pas les quelques minutes de sa création. Mais, bien que de très courte durée, la lumière qu’elle projette est intense et marquante. Création à l’état pur, l’improvisation se bâtit dans le moment présent. On ne saurait la contrôler ou lui dicter sa voix. Elle est libre, incontrôlable et indomptée. Depuis 45 ans, le Théâtre de la LNI s’attaque à l’art de l’éphémère et du spontané. C’est une preuve de sa détermination à être un modèle durable pour la culture québécoise.",
                    "2023-06-12",
                    40.0,
                    "Noirs",
                    "Bleus"
            );


            Spectacle spec19 = new Improvisation(
                    250,
                    "20:00",
                    "Les Rouges visitent les Jaunes",
                    "improvisation",
                    "Si le théâtre est une créature éphémère qui ne vit que quelques semaines, voire quelques mois, l’improvisation est une luciole dont l’existence ne dépasse pas les quelques minutes de sa création. Mais, bien que de très courte durée, la lumière qu’elle projette est intense et marquante. Création à l’état pur, l’improvisation se bâtit dans le moment présent. On ne saurait la contrôler ou lui dicter sa voix. Elle est libre, incontrôlable et indomptée. Depuis 45 ans, le Théâtre de la LNI s’attaque à l’art de l’éphémère et du spontané. C’est une preuve de sa détermination à être un modèle durable pour la culture québécoise.",
                    "2023-07-12",
                    40.0,
                    "Jaunes",
                    "Rouges"
            );


            Spectacle spec20 = new Improvisation(
                    250,
                    "20:00",
                    "Les Jaunes visitent les Bleus",
                    "improvisation",
                    "Si le théâtre est une créature éphémère qui ne vit que quelques semaines, voire quelques mois, l’improvisation est une luciole dont l’existence ne dépasse pas les quelques minutes de sa création. Mais, bien que de très courte durée, la lumière qu’elle projette est intense et marquante. Création à l’état pur, l’improvisation se bâtit dans le moment présent. On ne saurait la contrôler ou lui dicter sa voix. Elle est libre, incontrôlable et indomptée. Depuis 45 ans, le Théâtre de la LNI s’attaque à l’art de l’éphémère et du spontané. C’est une preuve de sa détermination à être un modèle durable pour la culture québécoise.",
                    "2023-08-12",
                    40.0,
                    "Bleus",
                    "Jaunes"
            );

            Spectacle spec21 = new Theatre(250,
                    "20:00",
                    "Les Miserables",
                    "theatre",
                    "Un classique de Victor Hugo",
                    "2023-07-07",
                    95.90,
                    "Le theatre du Nouveau Monde",
                    "Victor Hugo");


            sRepo.saveAll(List.of(spec1, spec2, spec3, spec4, spec5, spec6, spec7, spec8, spec9, spec10, spec11, spec12, spec13, spec14, spec15, spec16, spec17, spec18, spec19, spec20, spec21));


        };
    }


}
