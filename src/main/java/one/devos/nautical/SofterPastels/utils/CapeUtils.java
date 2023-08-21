// --------------------------------------------------------------------------------
// This code was taken from Create Steam n' Rails under the MIT license
// and with permission from one of the developers, thank you for that!
//
// Check em out here https://github.com/Layers-of-Railways/Railway
// --------------------------------------------------------------------------------

package one.devos.nautical.SofterPastels.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.world.entity.player.Player;
import one.devos.nautical.SofterPastels.SofterPastels;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.concurrent.CompletableFuture;

public enum CapeUtils {
    INSTANCE;

    private final Set<UUID> registeredDevs = new HashSet<>();

    private static final String url = "https://spamton.asoji.one/capes.json/raw";

    private boolean initialized = false;

    public void init() {
        if (initialized)
            return;
        initialized = true;
        refresh();
    }

    public void refresh() {
        CompletableFuture.runAsync(() -> {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url))
                    .GET()
                    .build();
            try {
                String body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
                JsonArray devArray = JsonParser.parseString(body).getAsJsonObject().getAsJsonArray("dev");
                Set<UUID> fetched = new HashSet<>();
                for (JsonElement element : devArray) {
                    if (element instanceof JsonObject object) {
                        if (object.has("id")) {
                            fetched.add(UUID.fromString(object.get("id").getAsString()));
                        }
                    }
                }
                registeredDevs.clear();
                registeredDevs.addAll(fetched);
            } catch (Exception e) {
                SofterPastels.LOGGER.error("Failed to fetch cape data", e);
            }
        });
    }

    public boolean isDev(Player player) { return isDev(player.getUUID()); }

    public boolean isDev(UUID id) { return registeredDevs.contains(id); }

    public boolean useDevCape(UUID id) {
        return isDev(id);
    }
}
