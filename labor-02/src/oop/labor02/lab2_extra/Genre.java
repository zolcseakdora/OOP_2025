package oop.labor02.lab2_extra;

    public enum Genre {
        Horror, Comedy, Drama, Thriller, Romance, Action;

        public static Genre fromString(String genre) {
            switch (genre.toLowerCase()) {
                case "horror":
                    return Horror;
                case "comedy":
                    return Comedy;
                case "drama":
                    return Drama;
                case "thriller":
                    return Thriller;
                case "romance":
                    return Romance;
                case "action":
                    return Action;
                default:
                    return null;
            }
        }
    }


