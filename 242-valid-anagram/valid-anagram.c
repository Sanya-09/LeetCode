#define CHAR_COUNT 256
bool isAnagram(char *s, char *t) {
    if (strlen(s) != strlen(t))
        return false;

    int count[CHAR_COUNT] = {0};
    for (int i = 0; s[i] != '\0'; i++) {
        count[(unsigned char)s[i]]++;
        count[(unsigned char)t[i]]--;
    }

    for (int i = 0; i < CHAR_COUNT; i++) {
        if (count[i] != 0)
            return false;
    }

    return true;
}